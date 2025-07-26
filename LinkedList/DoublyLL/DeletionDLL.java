package LinkedList.DoublyLL;

public class DeletionDLL {

    public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node insertNode(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public static Node deleteAtHead(Node head) {
        if (head == null || head.next == null) {
            head = null;
            return head;
        }

        Node temp = head;
        temp = temp.next;
        temp.prev = null;
        head = temp;

        return head;
    }

    public static Node deleteAtTail(Node head) {
        if (head == null || head.next == null) {
            head = deleteAtHead(head);
            return head;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next.prev = null;
        temp.next = null;

        return head;

    }

    public static Node deleteAtIndex(int index, Node head) {
        if (index < 0) {
            return head;
        }

        if (index == 0) {
            head = deleteAtHead(head);
            return head;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null) { // index out of bound
                return head;
            }
            temp = temp.next;
        }

        Node nodeToDelete = temp.next;
        if (nodeToDelete == null) { // index out of bounds
            return head;
        }

        Node later = nodeToDelete.next;
        temp.next = later;
        if (later != null) {
            later.prev = temp;
        }

        return head;
    }

    public static Node deleteByValue(int target, Node head) {
        if (head == null) {
            return head;
        }

        if (head.data == target) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        Node temp = head;

        // Traverse the list to find the node with the target value
        while (temp != null && temp.data != target) {
            temp = temp.next;
        }

        // If the target is not found
        if (temp == null) {
            return head;
        }

        // Deleting the found node
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

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

    public static void main(String[] args) {
        Node head = null;

        head = insertNode(10, head);
        head = insertNode(20, head);
        head = insertNode(30, head);
        head = insertNode(40, head);
        head = insertNode(50, head);
        head = insertNode(60, head);
        head = insertNode(70, head);
        head = insertNode(80, head);
        head = insertNode(90, head);

        printLinkedList(head);

        head = deleteAtHead(head);
        head = deleteAtTail(head);
        head = deleteAtIndex(1, head);
        head = deleteByValue(60, head);
        printLinkedList(head);

    }
}