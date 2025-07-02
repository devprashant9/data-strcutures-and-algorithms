import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        selectionSort(arr);

        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int min; 
        
        for (int i = 0; i < arr.length - 1; i++) {
            min = i; // assuming minimum to be the 1st element at each iteration
            
            for (int j = i; j < arr.length; j++) {
                
                if(arr[j] < arr[i]) {
                    min = j; // finding the actual minimum in each iteration
                }
            }
            swapHelper(arr, min, i); // swapping the minimum value with i-th place element
        }
    }

    public static void swapHelper(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}