/**
 *                          1
 *                      1       1
 *                  1       2       1
 *            1         3       3       1
 *         1       4       6       4       1
 *      1       5       10      10      5       1
 *     
 */

public class NthPascalTerm {

    public static void main(String[] args) {
        int row = 5;
        int col = 3;
        nthPascalTerm(row, col);
    }

    public static void nthPascalTerm(int row, int col) {
        long res = 1;

        for (int i = 0; i < col; i++) {
            res = res * (row - i);
            res = res / (i + 1);
        }
        System.out.println("The Term is: " +res);
    }
}