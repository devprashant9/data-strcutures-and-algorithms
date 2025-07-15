package Binary_Search.Easy;

public class SquareRoot {

    public static void main(String[] args) {
        int X = 99;
        squareRoot(X);
    }

    public static void squareRoot(int X) {
        int low = 1;
        int high = X;
        int mid = 0;
        int ans = -1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (mid * mid <= X) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("The Square Root is: " +ans);
    }
}