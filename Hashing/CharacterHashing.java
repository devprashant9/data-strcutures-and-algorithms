import java.util.Arrays;
import java.util.Scanner;

public class CharacterHashing {

    public static void main(String[] args) {

        int[] frequencyArray = new int[26];

        // input for length
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Characters to Find Frequency: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            frequencyArray[arr[i] - 'a'] += 1;
        }
        
        System.out.println("Enter Y/y to Check Frequency, Any Other to Exit: ");
        char c = sc.nextLine().charAt(0);

        while (c == 'Y' || c == 'y') {
            System.out.println("Enter a Character: ");
            char ch = sc.nextLine().charAt(0);
            System.out.println("Frequency of " + ch + " is: " + frequencyArray[ch - 'a']);

            System.out.println("Enter Y/y to Check Frequency Again, Other to Exit: ");
            c = sc.nextLine().charAt(0);
        }
    }
}