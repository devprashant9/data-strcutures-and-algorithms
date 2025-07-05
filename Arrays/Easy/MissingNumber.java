package Arrays.Easy;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int N = 5;
        missingNumber(arr, N);
    }

    // Brute Force: for loop
    // Brute Optimized: O(N^2)

    // Better => Hashing

    public static void missingNumber(int[] arr, int N) {
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }

        int sumN = (N*(N + 1)) / 2;

        int missNum = sumN - sumArr;
        System.out.println("Missing Number is: " +missNum);
    }
}