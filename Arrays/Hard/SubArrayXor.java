import java.util.Map;
import java.util.HashMap;

public class SubArrayXor {

    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 6, 4 };
        int K = 6;
        countSubArraysXorEqualsK(arr, K);
    }

    public static void countSubArraysXorEqualsK(int[] arr, int K) {
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        int xor = 0;

        mp.put(0, 1); // Initial condition

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];

            int requiredXor = xor ^ K;

            if (mp.containsKey(requiredXor)) {
                count += mp.get(requiredXor);
            }

            mp.put(xor, mp.getOrDefault(xor, 0) + 1);
        }

        System.out.println("Number of Sub Arrays Are: " + count);
    }

}