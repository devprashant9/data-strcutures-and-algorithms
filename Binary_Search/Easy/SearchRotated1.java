package Binary_Search.Easy;

public class SearchRotated1 {

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int X = 1;
        int idx = searchInRotated(arr, X);
        System.out.println("Element Found at Index: " +idx);
    }

    public static int searchInRotated(int[] arr, int X) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int index = -1;

        while (low <= high) {
            mid = low  + ((high - low) / 2);

            if (arr[mid] == X) {
                index = mid;
                return index;
            } else if (arr[low] <= arr[mid]) {
                if (arr[low] <= X && X <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                 if (arr[low] <= X && X <= arr[mid]) {
                    high = mid + 1;
                } else {
                    low = mid - 1;
                }
            }
        }
        return index;
    }
}