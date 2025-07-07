import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 4, 3, 0, 0 };
        nextPermutation(arr);
    }

    public static void nextPermutation(int[] arr) {
        int breakPoint = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                breakPoint = i;
                break;
            }
        }

        for (int i = arr.length - 1; i > breakPoint; i--) {
            if (arr[i] > arr[breakPoint]) {
                // Swap
                int temp = arr[i];
                arr[i] = arr[breakPoint];
                arr[breakPoint] = temp;
                break;
            }
        }

        reverseArray(arr, breakPoint + 1, arr.length - 1);

        System.out.println("The Next Permutation is: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}