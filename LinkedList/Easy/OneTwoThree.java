package LinkedList.Easy;

public class OneTwoThree {

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

    public static Node sortZeroOneTwo(Node head){
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;
        while (temp.next != null) {
            if(temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if(temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        zero.next = oneHead.next != null ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        return zeroHead.next;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtHead(0, head);
        head = insertAtHead(1, head);
        head = insertAtHead(0, head);
        head = insertAtHead(2, head);
        head = insertAtHead(1, head);
        head = insertAtHead(2, head);
        printLinkedList(head);

        head = sortZeroOneTwo(head);
        printLinkedList(head);
    }
}