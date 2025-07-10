import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};

        mergeSortedArrays(arr1, arr2);
    }

    public static void mergeSortedArrays(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = arr2[0];

        while (i >= 0 && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;

                i--;
                j++;
            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Sorted Arrays Are: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}