import java.util.Arrays;

public class BubbleSortRecursive {

    public static void main(String[] args) {
        int[] arr = { 1, 9, 2, 3, 7, 8, 0, 6, 4, 5 };
        bubbleSortRecursive(arr, arr.length, 0);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void bubbleSortRecursive(int[] arr, int n, int i) {
        if (n == 1)
            return;

        if (i < n - 1) {

            // swap if start < length - 1
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            bubbleSortRecursive(arr, n, i + 1); // 1 iteration done
        } else {
            bubbleSortRecursive(arr, n - 1, 0); // one pass done, start again
        }
    }
}