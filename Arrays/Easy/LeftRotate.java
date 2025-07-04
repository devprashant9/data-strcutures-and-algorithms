import java.util.Arrays;

public class LeftRotate {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4 };
        leftRotate(arr);
    }

    // left rotate by one place
    public static void leftRotate(int[] arr) {
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;
        System.out.println("Array After Rotation: ");
        System.out.println(Arrays.toString(arr));
    }
}