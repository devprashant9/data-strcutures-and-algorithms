import java.util.Map;
import java.util.HashMap;

public class SubArraySumPositiveNegative {

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3, 0, -3, 2, 3};
        int K = 5;

        subArraySumPositiveNegative(arr, K);
    }

    public static void subArraySumPositiveNegative(int[] arr, int K) {
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
        System.out.println("The Sub Array Length is: " +maxLen);
    }
}