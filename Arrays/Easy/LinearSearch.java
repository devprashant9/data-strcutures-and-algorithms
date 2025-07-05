package Arrays.Easy;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {10, 40, 60, 90, 50, 70, 30, 20};
        int target = 20;
        linearSearch(arr, target);
    }

    public static void linearSearch(int[] arr, int target) {
        int f = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                f = 1;
                break;
            }
        }

        if(f == 1) {
            System.out.println("Number Present");
        } else {
            System.out.println("Number NOT Present");
        }
    }
}