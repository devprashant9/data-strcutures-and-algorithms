package Sorting2;

public class LongestRepeating {

    public static void main(String[] args) {
        String str = "ABAB";
        int K = 2;
        longestRepeatingCharacter(str, K);
    }

    public static void longestRepeatingCharacter(String str, int K) {
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (isValid(i, j, str, K)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        System.out.println("The Longest Replacement is: " +maxLength);
    }

    public static boolean isValid(int start, int end, String str, int K) {
        int[] freq = new int[26];
        int maxCount = 0;

        for (int i = start; i < end; i++) {
            char ch = str.charAt(i);
            freq[ch - 'A']++;
            maxCount = Math.max(maxCount, freq[ch - 'A']);
        }

        int windowSize = end - start + 1;
        int replacements = windowSize - maxCount;

        return replacements <= K;
    }
}