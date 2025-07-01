import java.util.Arrays;
import java.util.Scanner;

class NumberHashing {

    public static void main(String[] args) {

        int[] frequencyArray = new int[100];

        // input for length
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

        for (int i = 0; i < arr.length; i++) {
            frequencyArray[arr[i]] += 1;
        }

        System.out.println("Enter Y/y to Check Frequency, Any Other to Exit: ");
        char c = sc.nextLine().charAt(0);

        while (c == 'Y' || c == 'y') {
            System.out.println("Enter a Number: ");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.println("Frequency of " + num + " is: " + frequencyArray[num]);

            System.out.println("Enter Y/y to Check Frequency Again, Other to Exit: ");
            c = sc.nextLine().charAt(0);
        }
    }
}