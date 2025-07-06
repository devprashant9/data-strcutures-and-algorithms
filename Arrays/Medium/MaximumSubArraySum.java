package Arrays.Medium;

public class MaximumSubArraySum {

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubArraySum(arr);
    }

    public static void maxSubArraySum(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum < 0) {
                sum = 0;
            }

            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("Maximum Sub Array Sum is: " +maxSum);
    }
}