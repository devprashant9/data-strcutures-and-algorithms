import java.util.Arrays;

class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 3, 7, 8, 0, 6, 4, 5};
        quickSort(arr, 0, arr.length - 1);  // inclusive range*
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low <= high) {
            int partitionIdx = reArrange(arr, low, high);
            quickSort(arr, low, partitionIdx - 1);
            quickSort(arr, partitionIdx + 1, high);
        }
    }

    public static int reArrange(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

             while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if(i < j) {
                // haven't crossed yet then only swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // placing pivot element at correct index
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; // return pivot index
    }
}