import java.util.*;

public class WeakestSoldierComparable {
    static class RowInfo implements Comparable<RowInfo> {
        int soldiers;
        int index;

        RowInfo(int soldiers, int index) {
            this.soldiers = soldiers;
            this.index = index;
        }

        @Override
        public int compareTo(RowInfo other) {
            // Max-heap logic: strongest first
            if (this.soldiers != other.soldiers) {
                return other.soldiers - this.soldiers;
            }
            return other.index - this.index;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<RowInfo> pq = new PriorityQueue<>();
        for (int i = 0; i < mat.length; i++) {
            int soldiers = countSoldiers(mat[i]);
            pq.offer(new RowInfo(soldiers, i));
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll().index;
        }
        return result;
    }

    private int countSoldiers(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) count++;
            else break;
        }
        return count;
    }
}
