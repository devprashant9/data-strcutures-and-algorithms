import java.util.Arrays;

public class ReversePairs {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 4, 1 };
        int count = reversePairs(arr, 0, arr.length - 1);
        System.out.println(count); // 4
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
    }

    public static int reversePairs(int[] arr, int start, int end) {
        if (start >= end)
            return 0;

        int mid = (start + end) / 2;
        int count = reversePairs(arr, start, mid)
                + reversePairs(arr, mid + 1, end)
                + mergeAndCount(arr, start, mid, end);
        return count;
    }

    private static int mergeAndCount(int[] arr, int start, int mid, int end) {
        // count cross‑half reverse pairs (arr[i] > 2 * arr[j])
        int count = 0, j = mid + 1;
        for (int i = start; i <= mid; i++) {
            while (j <= end && (long) arr[i] > 2L * arr[j])
                j++;
            count += (j - (mid + 1));
        }

        // standard merge
        int len1 = mid - start + 1, len2 = end - mid;
        int[] left = new int[len1];
        int[] right = new int[len2];
        System.arraycopy(arr, start, left, 0, len1);
        System.arraycopy(arr, mid + 1, right, 0, len2);

        int i = 0, k = start;
        j = 0;
        while (i < len1 && j < len2)
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        while (i < len1)
            arr[k++] = left[i++];
        while (j < len2)
            arr[k++] = right[j++];

        return count;
    }
}