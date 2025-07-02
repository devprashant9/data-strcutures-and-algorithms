import java.util.Arrays;

public class BubblSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        bubbleSort(arr);

        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                
                if(arr[j + 1] < arr[j]) {
                    swapHelper(arr, j + 1, j);
                }
            }
        }
    }

    public static void swapHelper(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}