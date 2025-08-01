package LinkedList.Easy;

public class StartNodeLoop {

    public static Node startNodeLoop(Node head) {
    Node slow = head;
    Node fast = head;

    // Detect the cycle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            // Find start of loop
            Node entry = head;
            while (entry != slow) {
                entry = entry.next;
                slow = slow.next;
            }
            return entry; // loop starting node
        }
    }

    return null;
}

}