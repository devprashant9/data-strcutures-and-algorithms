package LinkedList.SinglyLL;

public class DeletionLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertNodes(int data, Node head) {
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
        return head;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node deleteAtHead(Node head) {
        if (head == null) {
            return head;
        } else if (head.next == null) {
            head = null;
            return head;
        } else {
            head = head.next;
            return head;
        }
    }

    public static Node deleteAtTail(Node head) {
        if (head == null) {
            return head;
        } else if (head.next == null) {
            head = null;
            return head;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }
    }

    public static Node deleteAtIndex(int index, Node head) {
        if (index < 0 || head == null) {
            return head;
        }

        if (index == 0) {
            return deleteAtHead(head);
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null)
                return head; // for out of bounds
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }

    public static Node deleteByValue(int target, Node head) {
        if (head == null) {
            return head;
        }

        if (head.data == target) {
            return head.next;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != target) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertNodes(10, head);
        head = insertNodes(20, head);
        head = insertNodes(30, head);
        head = insertNodes(40, head);
        head = insertNodes(50, head);
        head = insertNodes(60, head);
        head = insertNodes(70, head);
        head = insertNodes(80, head);
        head = insertNodes(90, head);

        printLinkedList(head);

        head = deleteAtHead(head);
        head = deleteAtTail(head);
        head = deleteAtIndex(2, head);
        head = deleteByValue(50, head);
        printLinkedList(head);
    }
}