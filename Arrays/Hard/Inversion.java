import java.util.Arrays;

public class Inversion {

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        int count = countInversion(arr, 0, arr.length - 1);
        System.out.println(count);
    }

    public static int countInversion(int[] arr, int start, int end) {
        int count = 0;
        
        if (start >= end) {
            return count;
        }

        int mid = (start + end) / 2;

        count += countInversion(arr, start, mid);
        count += countInversion(arr, mid + 1, end);
        count += mergeArrays(arr, start, mid, end);
        return count;
    }

    public static int mergeArrays(int[] arr, int start, int mid, int end) {
        int count = 0;
        
        int len1 = mid - start + 1;
        int len2 = end - mid;

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[start + i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = start;

        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
                count = count + (len1 - i);
            }
        }

        while (i < len1) {
            arr[k++] = arr1[i++];
        }

        while (j < len2) {
            arr[k++] = arr2[j++];
        }

        return count;
    }

}