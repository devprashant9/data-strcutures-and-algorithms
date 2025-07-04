import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4 };
        removeDuplicates(arr);
    }

    // duplicates => always think about SET initially
    // TC => O(N)
    // SC => O(N)
    public static void removeDuplicates1(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println("Unique Elements Are: ");
        System.out.println(set);
        System.out.println(set.size());
    }

    public static void removeDuplicates(int[] arr) {
        int i = 0;
        int j = 1;

        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++; // j always moves is the key factor
            } else {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++; // j always moves is the key factor
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(i + 1);
    }
}