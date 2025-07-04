import java.util.Arrays;

public class RotateArray_D {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        leftRotate_D(arr, 99);
    }

    // 99 % 7 => 14 => 1

    // Brute Force
    // Create 2 New Arrays and Copy
    // Join Both the Arrays

    public static void leftRotate_D(int[] arr, int d){
        int totalRotations = d % arr.length;

        reverseHelper(arr, 0, totalRotations - 1);
        reverseHelper(arr, totalRotations, arr.length - 1);
        reverseHelper(arr, 0, arr.length - 1);

        System.out.println("Rotated Array is: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseHelper(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}