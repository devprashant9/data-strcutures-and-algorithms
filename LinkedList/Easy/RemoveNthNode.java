package LinkedList.Easy;

public class RemoveNthNode {

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

    public static Node removeNthNode(Node head, int N) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < N; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
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

        head = removeNthNode(head, 1);
        printLinkedList(head);
    }
}