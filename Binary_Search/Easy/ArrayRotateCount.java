package Binary_Search.Easy;

public class ArrayRotateCount {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 0, 1, 2, 3};
        int count = numberOfTimesRotated(arr);
        System.out.println("Number Of Times Array Rotated: " +count);
    }

    public static int numberOfTimesRotated(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            mid = (high + low) / 2;

            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                break;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }

                low = mid + 1;
            } else {
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }
                high = mid - 1;
            }
        }
        return index;
    }
}