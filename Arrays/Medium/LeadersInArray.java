import java.util.List;
import java.util.ArrayList;

public class LeadersInArray {

    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        leadersInArray(arr);
    }

    public static void leadersInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                list.add(arr[i]);
                max = arr[i];

            }
        }
        System.out.println(list);
    }
}