import java.util.Arrays;

public class InsertionSortRecursive {

    public static void main(String[] args) {
        int[] arr = { 1, 9, 2, 3, 7, 8, 0, 6, 4, 5 };

        insertionSortRecursive(arr, 0);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void insertionSortRecursive(int[] arr, int i) {
        if(i == arr.length) {
            return;
        }

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            swapHelper(arr, j - 1, j);
            j--;
        }
        insertionSortRecursive(arr, i + 1);
    }

    public static void swapHelper(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}