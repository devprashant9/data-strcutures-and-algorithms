import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5};
        int K = 8;
        fourSum(arr, K);
    }

    public static void fourSum(int[] arr, int K) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int k = j + 1;
                int l = arr.length - 1;

                while (k < l) {
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];

                    if (sum == K) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        list.add(arr[l]);

                        ans.add(list);
                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }

                        while (l > k && arr[l] == arr[l + 1]) {
                            l--;
                        }

                    } else if (sum < K) {
                        k++;
                    } else {
                        l--;
                    }
                }

            }
        }
        System.out.println("The Solution is: " +ans);
    }
}