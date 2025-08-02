class Node {

    public List<int[]> findPairsWithSum(Node head, int target) {
        List<int[]> result = new ArrayList<>();

        // Set two pointers: one at start, one at end
        Node first = head;
        Node second = head;

        // Move `second` to the end of the list
        while (second.next != null) {
            second = second.next;
        }

        // Two-pointer approach
        while (first != null && second != null && first != second && second.next != first) {
            int sum = first.data + second.data;

            if (sum == target) {
                result.add(new int[] { first.data, second.data });
                first = first.next;
                second = second.prev;
            } else if (sum < target) {
                first = first.next;
            } else {
                second = second.prev;
            }
        }

        return result;
    }
}