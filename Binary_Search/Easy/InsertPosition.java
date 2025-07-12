package Binary_Search.Easy;

public class InsertPosition {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7 };
        int X = 6;

        int idx = insertPosition(arr, X);
        System.out.println("Insert Position is at Index: " + (idx));
    }

    public static int insertPosition(int[] arr, int X) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int ans = arr.length;

        while (low <= high) {
            mid = low + ((high - low) / 2);

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