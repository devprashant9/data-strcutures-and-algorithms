package Backtracking;

import java.util.*;

public class CombinationSumI {

    public static List<List<Integer>> combinationSumI(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        backtrack(arr, 0, target, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] arr, int index, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            if (i > index && arr[i] == arr[i - 1])
                continue;

            if (arr[i] > target)
                break;

            current.add(arr[i]);
            backtrack(arr, i + 1, target - arr[i], current, result);
            current.remove(current.size() - 1);
        }
    }
}
