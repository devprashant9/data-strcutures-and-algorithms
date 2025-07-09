import java.util.List;
import java.util.ArrayList;

public class MajorityNBy3 {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };
        majorityNBy3(arr);
    }

    public static void majorityNBy3(int[] arr) {
        int cnt1 = 0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;

        // First pass - find possible candidates
        for (int num : arr) {
            if (num == ele1) {
                cnt1++;
            } else if (num == ele2) {
                cnt2++;
            } else if (cnt1 == 0) {
                ele1 = num;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                ele2 = num;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        // Second pass - verify counts
        cnt1 = 0;
        cnt2 = 0;
        for (int num : arr) {
            if (num == ele1)
                cnt1++;
            else if (num == ele2)
                cnt2++;
        }

        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        if (cnt1 > n / 3)
            result.add(ele1);
        if (cnt2 > n / 3)
            result.add(ele2);

        System.out.println("Elements appearing more than n/3 times: " + result);
    }

}