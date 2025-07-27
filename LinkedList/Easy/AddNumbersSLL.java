package LinkedList.Easy;

public class AddNumbersSLL {

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

    public static Node addTwoLists(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        Node dummyNode = new Node(-1);
        Node dummyTemp = dummyNode;

        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int sum = carry;

            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.next;
            }

            Node newNode = new Node(sum % 10);
            carry = sum / 10;

            dummyTemp.next = newNode;
            dummyTemp = dummyTemp.next; // 🛠 important step
        }

        if (carry > 0) {
            Node newNode = new Node(carry);
            dummyTemp.next = newNode;
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {
        Node head1 = null;
        Node head2 = null;

        head1 = insertAtHead(6, head1);
        head1 = insertAtHead(4, head1);
        head1 = insertAtHead(2, head1);

        head2 = insertAtHead(7, head2);
        head2 = insertAtHead(8, head2);
        head2 = insertAtHead(3, head2);

        printLinkedList(head1);
        printLinkedList(head2);

        Node newList = null;
        newList = addTwoLists(head1, head2);
        printLinkedList(newList);
    }
}