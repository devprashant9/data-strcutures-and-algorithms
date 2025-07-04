
public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = { 10, 30, 80, 50, 40, 70, 80, 90, 60, 70, 80 };
        secondLargest(arr);
    }

    public static void secondLargest(int[] arr) {
        int largest = arr[0];
        int sLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }

        System.out.println("Second Largest Element is: " +sLargest);
    }
}

// TC => O(N)
// SC => O(1)