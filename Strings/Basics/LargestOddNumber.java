package Strings.Basics;

public class LargestOddNumber {

    public static void main(String[] args) {
        String s = "52";
        String ans = largestOddNumber(s);
        System.out.println("The Answer is: " +ans);
    }

    public static String largestOddNumber(String num) {
        
        for(int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            int numeric = (int) ch;
            if(numeric % 2 != 0) {
                return(num.substring(0, i + 1));
            }
        }

        return "";
    }
}