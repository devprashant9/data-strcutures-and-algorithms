package LinkedList.SinglyLL;

public class LL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insertAtHead(int data, Node head) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static Node insertAtTail(int data, Node head) {
        if (head == null) {
            head = insertAtHead(data, head);
            return head;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        return head;
    }

    public static Node insertAtIndex(int data, int index, Node head) {
        if (index < 0) {
            return head;
        } else if (index == 0) {
            return insertAtHead(data, head);
        } else {
            Node temp = head;
            // Traverse to the (index - 1)th node
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    return head; // index is out of bounds
                }
                temp = temp.next;
            }

            if (temp == null) {
                return head; // index is greater than list length
            }

            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
            return head;
        }
    }

    public static Node insertBeforeValue(int data, int value, Node head) {
        if (head == null) {
            return head;
        }

        if (head.data == value) {
            return insertAtHead(data, head);
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            return head;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtHead(10, head);
        head = insertAtTail(20, head);
        head = insertAtTail(30, head);
        head = insertAtTail(40, head);
        head = insertAtTail(50, head);
        head = insertAtIndex(60, 2, head);
        head = insertBeforeValue(70, 60, head);

        printLinkedList(head);
    }
}
