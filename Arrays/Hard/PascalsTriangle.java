import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {

    public static void main(String[] args) {
        int N = 5;
        printPascalTriangle(N);
    }

    public static void printPascalTriangle(int N) {
        List<List<Long>> ans = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            long res = 1;
            List<Long> list = new ArrayList<>();
            list.add(res);
            for (int j = 1; j <= i; j++) {
                res = res * (i - j + 1);
                res = res / j;
                list.add(res);
            }
            ans.add(list);
        }
        System.out.println(ans);
    }
}