import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 5, 1};
        int target = 14;
        int[] ans = twoSum(arr, target);
        System.out.println("The Indices Are: " +Arrays.toString(ans));
    }

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];

            if(mp.containsKey(rem)) {
                return new int[] {i, mp.get(rem)};
            }
            mp.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }
}