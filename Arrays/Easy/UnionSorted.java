import java.util.List;
import java.util.ArrayList;

public class UnionSorted {

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5 };

        unionArray(arr1, arr2);
    }

    public static void unionArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } else {
                if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }

        System.out.println(list);

    }
}
