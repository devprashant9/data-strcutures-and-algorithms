import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = { -2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2 };
        int k = 0;
        threeSum(arr, 0);
    }

    public static void threeSum(int[] arr, int K) {

        Arrays.sort(arr);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < K) {
                    j++;
                } else if (sum > K) {
                    k--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);

                    ans.add(list);
                    j++;
                    k--;

                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }

                    while (k > j && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }
        }
        System.out.println("The Solutions Are: " +ans);
    }
}