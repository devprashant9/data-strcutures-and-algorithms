public class MaximumOnes {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};
        missingNumber(arr);

    }

    public static void missingNumber(int[] arr) {
        int count = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count = count + 1;
                maxLen = Math.max(maxLen, count);
            } else {
                count = 0;
            }
        }
        System.out.println("Maximum Consecutive 1's Length: " +maxLen);
    }
}