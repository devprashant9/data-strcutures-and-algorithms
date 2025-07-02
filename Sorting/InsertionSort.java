import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        insertionSort(arr);

        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
                int j = i; // picking up the element

                while(j > 0 && arr[j - 1] > arr[j]) {  // check if j is greater than 0 along with any mismatch value
                    swapHelper(arr, j - 1, j); // if found then swap until while condition is false
                    j--;
                }
            }
        }

    public static void swapHelper(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}