public class MinimumDaysToShip {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int X = 5;
        minimumDays(arr, X);
    }

    public static void minimumDays(int[] arr, int X) {
        int low = getMax(arr);
        int high = getSum(arr);
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int res = numberOfDays(arr, mid);

            if (res <= X) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Least Capacity is: " + ans);
    }

    public static int numberOfDays(int[] arr, int capacity) {
        int days = 1;
        int accumulated = 0;
        for (int weight : arr) {
            if (accumulated + weight > capacity) {
                days++;
                accumulated = 0;
            }
            accumulated += weight;
        }
        return days;
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) max = Math.max(max, num);
        return max;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }
}