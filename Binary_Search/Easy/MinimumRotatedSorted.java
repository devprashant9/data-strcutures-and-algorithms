package binarysearch.easy;

public class MinimumRotatedSorted {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int min = findMin(arr);
        System.out.println("Minimum = " + min);   // ➜ 0
    }

    /**
     * Finds the minimum element in a rotated sorted array (no duplicates).
     * Time O(log n), Space O(1).
     */
    public static int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            // If the current window is already sorted, arr[low] is the min.
            if (arr[low] <= arr[high]) {
                return arr[low];
            }

            int mid = low + (high - low) / 2;

            // Minimum is in the unsorted half.
            if (arr[mid] > arr[high]) {
                // Left half is sorted ⇒ min sits to the right of mid.
                low = mid + 1;
            } else {
                // Right half (mid … high) is sorted ⇒ min sits at mid or to the left of mid.
                high = mid;
            }
        }
        return arr[low];  // low == high ⇒ exact index of minimum
    }
}
