import java.util.List;
import java.util.ArrayList;

public class IntersectionSorted {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};

        interSectionSorted(arr1, arr2);
    }

    // visited array for either arr1 or arr2, say arr2
    // if arr1 has a corresponding element in arr2, mark visited at that inde as 1

    public static void interSectionSorted(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                i++;
            } else if(arr2[j] < arr1[i]) {
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            } 
        }

        System.out.println(list);
    }
}