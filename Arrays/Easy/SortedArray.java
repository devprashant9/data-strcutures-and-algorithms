public class SortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 4, 4, 0};

        boolean result = sortedArray(arr);
        System.out.println("Given Array is Sorted? " +result);
    }

    // ascending order
    public static boolean sortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] < arr[i]) {
               return false;
            }
        }
        return true;
    }
}