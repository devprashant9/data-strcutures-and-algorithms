import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 3},
            {2, 6},
            {8, 9},
            {9, 11},
            {8, 10},
            {2, 4},
            {15, 18},
            {16, 17}
        };

        List<int[]> result = mergeIntervals(arr);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static List<int[]> mergeIntervals(int[][] arr) {
        List<int[]> merged = new ArrayList<>();

        // Sort based on start times
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int[] current = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= current[1]) {
                // Overlapping interval, so merge
                current[1] = Math.max(current[1], arr[i][1]);
            } else {
                // No overlap, add the previous interval
                merged.add(current);
                current = arr[i];
            }
        }

        // Add the last interval
        merged.add(current);

        return merged;
    }
}