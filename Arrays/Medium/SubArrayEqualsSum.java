import java.util.Map;
import java.util.HashMap;

public class SubArrayEqualsSum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int K = 3;
        subArrayEqualsSum(arr, K);
    }

    public static void subArrayEqualsSum(int[] arr, int K) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int remove = prefixSum - K;
            count = count + mp.getOrDefault(remove, 0);
            mp.put(prefixSum, mp.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println("Number of Sub Arrays With Equal Sum " + K + " is " + count);
    }
}