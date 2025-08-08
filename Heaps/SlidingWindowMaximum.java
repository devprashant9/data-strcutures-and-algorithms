import java.util.*;

public class SlidingWindowMaxComparable {
    static class Pair implements Comparable<Pair> {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Pair other) {
            return other.value - this.value; // sort
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int n = nums.length;
        int[] result = new int[n - k + 1];

        for (int i = 0; i < n; i++) {
            pq.offer(new Pair(nums[i], i));

            // Remove elements outside window
            while (pq.peek().index <= i - k) {
                pq.poll();
            }

            if (i >= k - 1) {
                result[i - k + 1] = pq.peek().value;
            }
        }
        return result;
    }
}
