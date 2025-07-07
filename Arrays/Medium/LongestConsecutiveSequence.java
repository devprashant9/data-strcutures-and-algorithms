import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        longestConsecutiveSequence(arr);
    }

    public static void longestConsecutiveSequence(int[] arr) {
        Arrays.sort(arr);

        int longest = 1;
        int count = 0;
        int lastSmaller = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] - 1 == lastSmaller) {
                count += 1;
                lastSmaller = arr[i];
            } else if(arr[i] != lastSmaller) {
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        System.out.println("Longest Sequence is: " +longest);
    }
}