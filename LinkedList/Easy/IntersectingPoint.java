package LinkedList.Easy;

public class IntersectingPoint {

    public static Node detectIntersectionPoint(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != temp2) {
            temp1 = (temp1 == null) ? head2 : temp1.next;
            temp2 = (temp2 == null) ? head1 : temp2.next;
        }

        return temp1;
    }
}