package Binary_Search.Easy;

public class SortedRotated2 {

    public static void main(String[] args) {
        int[] arr = { 7, 8, 1, 2, 3, 3, 3, 4, 5, 6 };
        int X = 3;
        int res = searchSortedRotatedDuplicates(arr, X);
        if (res > -1) {
            System.out.println("Found At Index: " +res);
        } else {
            System.out.println("Not Found");
        }
    }

    public static int searchSortedRotatedDuplicates(int[] arr, int X) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = low + ((high - low) / 2);

            if (arr[mid] == X) {
                return mid;
            }

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            if (arr[low] <= arr[mid]) { // left part sorted
                if (arr[low] <= X && X <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= X && X <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
