package Binary_Search.Medium;

public class KthMissingNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int K = 5;
        kthMissingNumber(arr, K);
    }

    public static void kthMissingNumber(int[] arr, int K) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            int missingNumber = arr[mid] - (mid + 1);
            if (missingNumber < K) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("The Missing Number is: " +(high + K + 1));
    }
}

/**
 * missingNumber = arr[high] = (high - 1)
 * ans = arr[high] + more
 * more = K - missing
 * 
 * ans = arr[high] + K - (arr[high] - high - 1)
 * ans = high + K + 1
 */