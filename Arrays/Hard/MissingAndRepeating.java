package Arrays.Hard;

public class MissingAndRepeating {

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int n = arr.length;
        findMissingAndRepeating(arr, n);
    }

    // prints: Repeating = 1, Missing = 5
    public static void findMissingAndRepeating(int[] arr, int n) {
        long sumN      = (long) n * (n + 1) / 2;          // Σ1‥n
        long sumSqN    = (long) n * (n + 1) * (2L * n + 1) / 6; // Σi²

        long sum  = 0, sumSq = 0;
        for (int val : arr) {
            sum   += val;
            sumSq += (long) val * val;
        }

        long diff      = sum - sumN;          // R − M
        long diffSq    = sumSq - sumSqN;      // R² − M² = (R−M)(R+M)

        long sumRM     = diffSq / diff;       // R + M
        long repeating = (diff + sumRM) / 2;  // (R−M + R+M)/2
        long missing   = repeating - diff;

        System.out.println("Repeating = " + repeating + ", Missing = " + missing);
    }
}
