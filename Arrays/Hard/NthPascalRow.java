package Arrays.Hard;

public class NthPascalRow {

    public static void main(String[] args) {
        int N = 5;
        nthPascalRow(N);
    }

    public static void nthPascalRow(int N) {
        long res = 1;
        System.out.println(res);
        for (int i = 0; i < N; i++) {
            res = res * (N - i);
            res = res / (i + 1);
            System.out.println(res);
        }
        // System.out.println(res);
    }
}