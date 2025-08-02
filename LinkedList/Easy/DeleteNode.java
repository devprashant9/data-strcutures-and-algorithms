class DeleteNode {

    public Node deleteAllOccurrences(Node head, int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next; // deleting head node
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }
            current = current.next;
        }

        return head;
    }
}
