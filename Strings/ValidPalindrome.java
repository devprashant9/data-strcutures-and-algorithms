package Strings;

public class ValidPlaindrome {

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrome(str);
        System.out.println("Given String is Palindrome? " +ans);
    }

    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char first = s.charAt(left);
            char last = s.charAt(right);

            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(first)) {
                left++;
            } else if (!Character.isLetterOrDigit(last)) {
                right--;
            } else {
                if (first != last) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}