public class AddOneToList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Main function to add 1
    public static Node addOne(Node head) {
        // Step 1: Reverse the linked list
        head = reverse(head);

        // Step 2: Add 1 to the reversed list
        Node temp = head;
        int carry = 1; // since we are adding 1

        while (temp != null) {
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;

            // If no carry left, we are done
            if (carry == 0)
                break;

            // If this is the last node and still carry is there
            if (temp.next == null && carry != 0) {
                temp.next = new Node(carry);
                carry = 0;
                break;
            }

            temp = temp.next;
        }

        // Step 3: Reverse the list again to restore original order
        head = reverse(head);
        return head;
    }

    // Utility to reverse linked list
    private static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    // Utility to print linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" → ");
            head = head.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(9);

        System.out.print("Original List: ");
        printList(head);

        head = addOne(head);

        System.out.print("After Adding 1: ");
        printList(head);
    }
}
