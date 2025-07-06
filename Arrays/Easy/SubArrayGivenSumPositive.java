import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class SubArrayGivenSumPostivite {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int K = 3;
        // subArrayGivenSumPositive(arr, K);
        optimialSolution(arr, K);
    }

    // Brute => O(N ^ 3) => O(N ^ 2)
    // Hashing + Prefix Sum

    public static void subArrayGivenSumPositive(int[] arr, int K) {
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum == K) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - K;
            if(mp.containsKey(rem)) {
                int len = i - mp.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if(!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }
        System.out.println("Longest Sub Array: " +maxLen);
    }

    public static void optimialSolution(int[] arr, int K) {
        Arrays.sort(arr);
        // [1, 1, 1, 1, 1, 2, 2, 3, 3, 4];

        int i = 0;
        int j = 0;
        int sum = 0;
        int maxLen = 0;

        while (j < arr.length) {
            
            sum += arr[i];

            while(j <= i && sum > K) {
                sum -= arr[i];
                i++;
            }
            
            if(sum == K) {
                maxLen = Math.max(maxLen, j - i + 1);
            }

            j++;
        }
        System.out.println("Maximum Length: " +maxLen);

    }
}