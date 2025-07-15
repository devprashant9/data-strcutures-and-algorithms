package Binary_Search.Easy;

public class PeakElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        peakElement(arr);
    }

    public static void peakElement(int[] arr) {
        if (arr.length == 1) {
            System.out.println("Peak Element is: " +arr[0]);
            return;
        } else {
            int low = 0;
            int high = arr.length -1;
            int mid = 0;

            while (low <= high) {
                mid = (low + high) / 2;

                if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                    System.out.println("Peak Element is: " +arr[mid]);
                    return;
                } else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    }
}