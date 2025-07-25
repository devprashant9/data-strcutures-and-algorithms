package LinkedList.DoublyLL;

public class InsertionDLL {

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

    public static Node insertAtTail(int data, Node head) {
        if (head == null) {
            head = insertAtHead(data, head);
            return head;
        }

        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public static Node insertAtIndex(int data, int index, Node head) {
        if (index < 0) {
            return head;
        }

        if (index == 0) {
            head = insertAtHead(data, head);
            return head;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;

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

        head = insertAtHead(10, head);
        head = insertAtTail(20, head);
        head = insertAtIndex(30, 1, head);
        printLinkedList(head);
    }
}