package LinkedList.Easy;

public class ReverseDLL {

    public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    public static Node insertAtHead(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;
        temp.prev = newNode;
        newNode.next = temp;
        head = newNode;

        return head;

    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node temp = null;

        while (current != null) {
            // SWAP
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to the next node (which is previous before swap)
            current = current.prev;
        }

        // After the loop, temp will be at the node before null
        // So return temp.prev as the new head
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtHead(10, head);
        head = insertAtHead(20, head);
        head = insertAtHead(30, head);
        head = insertAtHead(40, head);
        head = insertAtHead(50, head);
        printLinkedList(head);

        head = reverseLinkedList(head);
        printLinkedList(head);
    }
}