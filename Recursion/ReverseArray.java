import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        reverseArray(arr, 0);
        System.out.println("Reversed Array is: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr, int start) {
        if(start >= arr.length/2) {
            return;
        }
        swapHelper(arr, start);
        reverseArray(arr, start + 1);
    }

    public static void swapHelper(int[] arr, int start) {
        int temp = arr[start]; // temp = 10
        arr[start] = arr[arr.length - start - 1]; // arr[0] = arr[4]
        arr[arr.length - start - 1] = temp; // arr[4] = temp
    }
}