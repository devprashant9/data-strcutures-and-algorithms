package Backtracking;

public class GridWays {

    public static int gridWays(int[][] matrix, int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i >= n || j > m) {
            return 0;
        }
        int a = gridWays(matrix, i + 1, j, n, m);
        int b = gridWays(matrix, i, j + 1, n, m);
        return (a + b);
    }
}