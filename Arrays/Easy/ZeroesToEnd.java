import java.util.Arrays;

public class ZeroesToEnd {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0 };
        moveZeroesToEnd(arr);
    }

    // Brute Force
    // Count Zeros and Shift Other Elements
    // Add Zeros Count to End

    public static void moveZeroesToEnd(int[] arr) {
        int i = 0; // Pointer to track position of first 0

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; // Move i forward only when swap is done
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}