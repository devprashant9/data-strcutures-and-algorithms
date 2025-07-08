import java.util.Arrays;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {1, 0, 0, 1}
        };

        setMatrixZeroes(arr);
    }

    public static void setMatrixZeroes(int[][] arr) {
        int[] rowMatrix = new int[arr.length];
        int[] colMatrix = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    rowMatrix[i] = 1;
                    colMatrix[j] = 1;
                }
            }
        }

          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (rowMatrix[i] == 1 || colMatrix[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


        
    }
}