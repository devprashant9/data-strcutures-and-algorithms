package Heaps;
import java.util.*;
public class NearbyCars {

    public static class Point implements Comparable<Point>{
        int x;
        int y;
        int dist;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.dist = x*x + y*y;
        }

        @Override
        public int compareTo(Point obj) {
            return this.dist - obj.dist;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{3, 3}, {5, -1}, {-2, 4}};
        int K = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(new Point(arr[i][0], arr[i][1]));
        }

        for (int i = 0; i < K; i++) {
            Point top = pq.remove();
            System.out.println(top.x + ", " + top.y);
        }


    }
}