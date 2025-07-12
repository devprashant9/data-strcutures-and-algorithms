package Binary_Search.Easy;

public class CeilValue {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int X = 25;
        int idx = ceilValue(arr, X);
        System.out.println("Ceil Value Position is at Index: " + (idx));
    }

    public static int ceilValue(int[] arr, int X) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (arr[mid] >= X) {
                ans = mid;
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

}