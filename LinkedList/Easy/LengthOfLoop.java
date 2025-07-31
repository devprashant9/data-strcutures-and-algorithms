package LinkedList.Easy;

public class LengthOfLoop {

    public static int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;

        boolean isLoop = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isLoop = true;
                break;
            }
        }

        if (!isLoop)
            return 0;

        int len = 1;
        Node temp = slow.next;

        while (temp != slow) {
            len++;
            temp = temp.next;
        }

        return len;
    }
}
