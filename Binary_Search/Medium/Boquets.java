package Binary_Search.Medium;

public class Boquets {

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int M = 2;
        int K = 3;
        minDays(arr, M, K);
    }

    public static void minDays(int[] arr, int M, int K) {
        int n = arr.length;
        
        // Impossible case: Not enough flowers
        if ((long) M * K > n) {
            System.out.println(-1);
            return;
        }

        int low = 1;
        int high = getMax(arr);
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canMakeBouquets(arr, M, K, mid)) {
                ans = mid;
                high = mid - 1; // try to minimize the day
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Minimum Days to Make Bouquets: " + ans);
    }

    public static boolean canMakeBouquets(int[] arr, int M, int K, int day) {
        int count = 0;
        int bouquets = 0;

        for (int bloomDay : arr) {
            if (bloomDay <= day) {
                count++;
                if (count == K) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return bouquets >= M;
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
}
