package Arrays.Medium;

public class BuySellStock {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        buySellStock(arr);
    }

    public static void buySellStock(int[] arr) {
        int profit = 0;
        int minValue = arr[0];
        int sellValue;

        for (int i = 0; i < arr.length; i++) {
            sellValue = arr[i] - minValue;
            profit = Math.max(sellValue, profit);
            minValue = Math.min(minValue, arr[i]);
        }
        System.out.println("Maximum Profit is: " +profit);
    }
}