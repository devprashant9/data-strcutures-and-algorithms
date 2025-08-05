package Backtracking;

import java.util.*;

public class CombinationSumI {

    public static List<List<Integer>> combinationSumI(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, 0, target, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] arr, int i, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (i >= arr.length || target < 0) {
            return;
        }

        // Include the current number (i.e., reuse same index)
        current.add(arr[i]);
        backtrack(arr, i, target - arr[i], current, result);
        current.remove(current.size() - 1);

        // Skip the current number (i.e., move to next index)
        backtrack(arr, i + 1, target, current, result);
    }
}
