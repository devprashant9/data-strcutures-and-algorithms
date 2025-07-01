import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class HashMapNumbers {

    public static void main(String[] args) {

        // input for array length
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int n = sc.nextInt();

        // input for array elements
        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();

        // creating a Map data structure
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println("Enter Y/y to Check Frequency, Any Other to Exit: ");
        char c = sc.nextLine().charAt(0);

        while (c == 'Y' || c == 'y') {
            System.out.println("Enter a Number: ");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.println("Frequency of " + num + " is: " + map.get(num));

            System.out.println("Enter Y/y to Check Frequency Again, Other to Exit: ");
            c = sc.nextLine().charAt(0);
        }
    }
}