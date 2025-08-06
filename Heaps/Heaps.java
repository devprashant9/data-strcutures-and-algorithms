import java.util.List;
import java.util.ArrayList;

class Heaps {

    public static class Heap {
        static List<Integer> heap = new ArrayList<>();
    }

    public static void insert(int data) {
        // Add the data at the end
        Heap.heap.add(data);

        int childIndex = Heap.heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;

        // Bubble up to maintain min-heap property
        while (childIndex > 0 && Heap.heap.get(childIndex) < Heap.heap.get(parentIndex)) {
            // Swap
            int temp = Heap.heap.get(childIndex);
            Heap.heap.set(childIndex, Heap.heap.get(parentIndex));
            Heap.heap.set(parentIndex, temp);

            // Update indices
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
    }

    public static int peek() {
        return Heap.heap.get(0);
    }

    public static int remove() {

        int removedValue = Heap.heap.get(0); // Root element

        int lastIndex = Heap.heap.size() - 1;
        int lastValue = Heap.heap.get(lastIndex);

        // Replace root with last
        Heap.heap.set(0, lastValue);

        // Remove last element
        Heap.heap.remove(lastIndex);

        // Restore heap property
        heapify(0);

        return removedValue;
    }

    public static void heapify(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int min = index;

        if (left < Heap.heap.size() && Heap.heap.get(left) < Heap.heap.get(min)) {
            min = left;
        }

        if (right < Heap.heap.size() && Heap.heap.get(right) < Heap.heap.get(min)) {
            min = right;
        }

        if (min != index) {
            // Swap
            int temp = Heap.heap.get(index);
            Heap.heap.set(index, Heap.heap.get(min));
            Heap.heap.set(min, temp);

            // Recursive call to fix further down
            heapify(min);
        }
    }

    public static void main(String[] args) {
        insert(40);
        insert(30);
        insert(20);
        insert(10);
        System.out.println(Heap.heap); // Output will be a min-heap like: [10, 30, 20, 40]
        System.out.println(peek());
    }
}
