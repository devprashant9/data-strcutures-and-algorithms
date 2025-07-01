public class PalindromeString {

    public static void main(String[] args) {
        
        String str = "prashant";
        boolean res = palindromeString(str, 0);
        System.out.println("The Given String is Palindrome? " +res);
    }

    public static boolean palindromeString(String str, int start) {
        if(start >= str.length()/2) {
            return true;
        }

        if(str.charAt(start) != str.charAt(str.length() - start - 1)) {
            return false;
        }
        return palindromeString(str, start + 1);
    }
}