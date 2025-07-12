

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int X = 40;
        int idx = binarySearch(arr, X);
        System.out.println("Target is Present at Position: " +(idx + 1));
    }

    public static int binarySearch(int[] arr, int X) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = low + ((high - low) / 2);

            if(arr[mid] == X) {
                return mid;
            } else if (arr[mid] < X) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}