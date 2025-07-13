package Binary_Search.Easy;

public class OccurrenceOfNumber {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int X = 8;
        countOccurrence(arr, X);
    }

    public static void countOccurrence(int[] arr, int X) {
        int first = lowerBound(arr, X);
        int last = upperBound(arr, X);
        System.out.println("Total Occurrences of " + X + " is: " +(last - first + 1));
    }

    public static int lowerBound(int[] arr, int X) {
        int low = 0, high = arr.length - 1, mid = 0;

        int first = -1;

        while(low <= high) {
            mid = low + ((high - low) / 2);

            if (arr[mid] >= X) {
                first = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return first;
    }

    public static int upperBound(int[] arr, int X) {
        int low = 0, high = arr.length - 1, mid = 0;

        int last = -1;

        while(low <= high) {
            mid = low + ((high - low) / 2);

            if (arr[mid] > X) {
                last = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return last - 1;
    }
}