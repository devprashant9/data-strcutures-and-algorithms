

public class UpperBound {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 7, 8, 9, 9, 9, 11};
        int X = 9;
        int idx = upperBound(arr, X);
        System.out.println("Upper Bound is at Index: " +(idx));
    }

    public static int upperBound(int[] arr, int X) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int ans = -1;

        while (low <= high) {
            mid = low + ((high - low) / 2);

            if(arr[mid] > X) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}