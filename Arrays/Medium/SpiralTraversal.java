

public class SpiralTraversal {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5, 6},
            {20, 21, 22, 23, 24, 07},
            {19, 32, 33, 34, 25, 8},
            {18, 31, 36, 35, 26, 9},
            {17, 30, 29, 28, 27, 10},
            {16, 15, 14, 13, 12, 11}
        };

        printSpiralTraversal(arr);
    }

    public static void printSpiralTraversal(int[][] arr) {
        int matSize = arr.length;
        int eachArrSize = arr[0].length;

        int top = 0;
        int bottom = matSize - 1;

        int left = 0;
        int right = eachArrSize - 1;

        while(top <= matSize && left <= right) { // until there are things to print

        for (int i = left; i <= right; i++) {
            System.out.println(arr[top][i]); // printing array at index 0
        }
        top++;

        for(int i = top; i <= bottom; i++) {
            System.out.println(arr[i][right]); // print last element of each array
        }
        right--;

        if(top <= bottom) {
            for(int i = right; i >= left; i--) {
                System.out.println(arr[bottom][i]); // print individual array from backward
            }
            bottom--;
        }

        if(left <= right) {
            for(int i = bottom; i >= top; i--) {
                System.out.println(arr[i][left]); // print first element of each array
            }
            left++;
        }
    }
    }
}