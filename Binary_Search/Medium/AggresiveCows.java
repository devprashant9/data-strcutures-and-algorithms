import java.util.Arrays;

public class AggresiveCows {

    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 7, 10, 9};
        int cows = 4;
        Arrays.sort(arr);
        minimumDistance(arr, cows);
    }

    public static void minimumDistance(int[] arr, int cows) {
        int low = 1;
        int high = maxValue(arr);
        int mid = 0;
        int ans = -1;

        while (low <= high) {
            mid = (low + high) / 2;
            
            if (calculateDistance(arr, mid, cows) == true) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("The Maximum Distance is: " +ans);
    }

    public static boolean calculateDistance(int[] arr, int mid, int cows) {
        int distance = arr[0];
        int placedCows = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - distance >= mid) {
                placedCows++;
                distance = arr[i];
            }
        }
        if(placedCows >= cows) {
            return true;
        }
        return false;
    }

    public static int maxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

