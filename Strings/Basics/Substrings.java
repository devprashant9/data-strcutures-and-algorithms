package Strings.Basics;

public class Substrings {

    public static void main(String[] args) {
        String str = "ABCD";
        generateSubstrings(str);
    }

    public static void generateSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j)); // for a substring i must be < j
            }
        }
    }
}