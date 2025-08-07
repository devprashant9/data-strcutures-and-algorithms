package Heaps;

import java.util.PriorityQueue;

public class ConnectRopes {

    public static int connectRopes(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        while (pq.size() > 1) {
            int firstTop = pq.remove();
            int secondTop = pq.remove();

            int c = firstTop + secondTop;
            cost += c;
            pq.add(c);
        }

        return cost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};

        int cost = connectRopes(ropes);
        System.out.println("Minimum Cost of Connecting Ropes is: " +cost);
    }
}