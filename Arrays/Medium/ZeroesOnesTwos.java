import java.util.Arrays;

public class ZeroesOnesTwos {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        zeroesOnesTwos(arr);
    }

    public static void zeroesOnesTwos(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high) {
            if(arr[mid] == 1) {
                mid++;
            } else if(arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println("The Sorted Array is: " +Arrays.toString(arr));
    }
}