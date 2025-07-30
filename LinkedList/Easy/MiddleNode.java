package LinkedList.Easy;

public class MiddleNode {

    public static Node findMiddleNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast == null) {
            return slow;
        }

        return slow.next;
    }
}