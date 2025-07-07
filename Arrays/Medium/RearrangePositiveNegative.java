import java.util.Arrays;

public class RearrangePositiveNegative {

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        rearrangePositiveNegative(arr);
    }

    public static void rearrangePositiveNegative(int[] arr) {
        int[] result = new int[arr.length];
        int posIndex = 0;
        int negIndex = 1;

        for (int num : arr) {
            if (num >= 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        // Copy result back to original array
        System.arraycopy(result, 0, arr, 0, arr.length);


        System.out.println("The Re-Arranged Array is: " + Arrays.toString(arr));
    }
}