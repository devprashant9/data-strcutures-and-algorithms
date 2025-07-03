import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 3, 7, 8, 0, 6, 4, 5};
        mergeSort(arr, 0, arr.length - 1);  // passing the high value as (arr.length) totally changes the overall code
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return; // base case: 0 or 1 element
        }

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);         // left half: low to mid
        mergeSort(arr, mid + 1, high);    // right half: mid+1 to high

        mergeArrays(arr, low, mid, high); // merge both halves
    }

    public static void mergeArrays(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int[] temp = new int[high - low + 1];
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }
}
