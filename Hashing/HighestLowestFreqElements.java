import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class HighestLowestFreqElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        System.out.print("Enter Array Elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        sc.nextLine();

        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            int freq = item.getValue();

            if (freq < lowest) {
                lowest = freq;
            }
            if (freq > highest) {
                highest = freq;
            }
        }

        System.out.println("Lowest Frequency Element: " + lowest);
        System.out.println("Highest Frequency Element: " + highest);
    }
}