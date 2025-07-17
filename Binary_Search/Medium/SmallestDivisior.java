package Binary_Search.Medium;

public class SmallestDivisior {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9};
        int X = 6;
        smallestDivisior(arr, X);
    }

    public static void smallestDivisior(int[] arr, int X) {
        int low = 1;
        int high = 5; // Max(arr[i])
        int mid = 0;
        int ans = -1;

        while (low <= high) {
            mid = (low + high) / 2;
            int res = divide(arr, mid);
            if (res <= X) {
                high = mid - 1;
                ans = mid;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("The Smallest Divisor is: " +ans);
    }

    public static int divide(int[] arr, int mid) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += (int) Math.ceil( (double) arr[i] / mid);
        }
        return ans;
    }
}