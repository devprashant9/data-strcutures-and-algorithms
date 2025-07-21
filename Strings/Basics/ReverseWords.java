package Strings.Basics;

public class ReverseWords {

    public static void main(String[] args) {
        String s = "the sky is blue";
        String ans = reverseWords(s);
        System.out.println("The Answer is: " +ans);
    }

    public static String reverseWords(String s) {
        s = s.trim();
        s = " " + s;
        
        int len = s.length();

        String newStr = "";

        int right = s.length();

        for(int left = len - 1; left >= 0; left--) {
            char ch = s.charAt(left);
            if(ch == ' ') {
                newStr = newStr + s.substring(left + 1, right);
                newStr = newStr.trim();
                newStr += " ";
                 right = left;
            }
        }
        return newStr.trim();
    }
}