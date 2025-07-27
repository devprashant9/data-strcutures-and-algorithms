package LinkedList.Easy;

public class OddEvenSLL {

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

    public static Node evenOdd(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node odd = head;
        Node even = head.next;
        Node mmeoizeEven = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = mmeoizeEven;
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
        
        head = evenOdd(head);
        printLinkedList(head);
    }
}