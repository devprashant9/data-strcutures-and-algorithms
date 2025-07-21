package Strings.Basics;

public class RemoveParantheses {

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        String ans = removeOuterParentheses(s);
        System.out.println("The Answer is: " +ans);

    }

    public static String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder ansStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (counter > 0) {
                    ansStr.append(ch);
                }
                counter++;
            } else {
                counter--;
                if (counter > 0) {
                    ansStr.append(ch);
                }
            }
        }

        return ansStr.toString();
    }
}