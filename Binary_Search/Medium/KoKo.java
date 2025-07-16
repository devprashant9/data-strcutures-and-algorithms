package Binary_Search.Medium;

public class KoKo {

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        int X = 8;
        eatingBananas(arr, X);
    }

    public static void eatingBananas(int[] arr, int X) {
        int low = 1;
        int high = getMax(arr);
        int mid;
        int ans = -1;

        while (low <= high) {
            mid = (low + high) / 2;
            int hours = helper(mid, arr);
            if (hours <= X) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Minimum Eating Speed: " + ans);
    }

    public static int helper(int speed, int[] arr) {
        int totalTime = 0;
        for (int bananas : arr) {
            totalTime += Math.ceil((double) bananas / speed); // ✅ proper ceiling
        }
        return totalTime;
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
}
