package Binary_Search.Medium;

public class NthRoot {

    public static void main(String[] args) {
        int N = 3;
        int M = 27;
        nthRoot(N, M);
    }

    public static void nthRoot(int N, int M) {
        int ans = -1;
        int low = 1;
        int high = M;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            int midN = helper(mid, N, M);

            if (midN == 1) {
                ans = mid;
                break;
            } else if (midN == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (ans == -1) {
            System.out.println("No integer N-th root exists.");
        } else {
            System.out.println("The N-th Root of M is: " + ans);
        }
    }

    public static int helper(int mid, int N, int M) {
        long ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= mid;
            if (ans > M) {
                return 2;
            }
        }
        if (ans == M)
            return 1;
        return 0;
    }
}
