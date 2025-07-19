package Strings;

public class CommonPrefix {

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        longestCommonPrefix(arr);
    }

    public static void longestCommonPrefix(String[] arr) {
        String maxPrefix = arr[0];

        for (int i = 0; i < arr.length; i++) {
            while (arr[i].startsWith(maxPrefix) == false) {
                maxPrefix = maxPrefix.substring(0, maxPrefix.length() - 1);
            }
        }
        System.out.println("Longest Common Prefix is: " +maxPrefix);
    }
}