package LinkedList.Easy;

public class ReverseSLL {

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

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static Node reverseSLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseSLL(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtHead(60, head);
        head = insertAtHead(50, head);
        head = insertAtHead(40, head);
        head = insertAtHead(30, head);
        head = insertAtHead(20, head);
        head = insertAtHead(10, head);
        printLinkedList(head);

        head = reverseSLL(head);
        printLinkedList(head);

    }
}