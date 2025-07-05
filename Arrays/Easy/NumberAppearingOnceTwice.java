package Arrays.Easy;

public class NumberAppearingOnceTwice {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        numberAppearingOnceTwice(arr);
    }

    public static void  numberAppearingOnceTwice(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println("Number Appearing Once: " +ans);
    }
}