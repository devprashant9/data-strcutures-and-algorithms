package Backtracking;

import java.util.*;

public class PalindromePartitioning {

    public static void palindromePartitioning(int i, String str, List<String> path, List<List<String>> res) {
        if (i == str.length()) {
            res.add(new ArrayList<>(path)); // Found a valid partition
            return;
        }

        for (int j = i; j < str.length(); j++) {
            if (isPalindrome(str, i, j)) {
                path.add(str.substring(i, j + 1)); // Choose
                palindromePartitioning(j + 1, str, path, res); // Explore
                path.remove(path.size() - 1); // Un-choose (backtrack)
            }
        }
    }

    public static boolean isPalindrome(String str, int i, int j) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> result = new ArrayList<>();
        palindromePartitioning(0, s, new ArrayList<>(), result);

        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}
