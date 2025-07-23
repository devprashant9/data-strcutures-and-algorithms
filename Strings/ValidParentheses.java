package Strings;

public class ValidParentheses {

    public static void main(String[] args) {
        String str = "()[]{}";
        boolean ans = isValid(str);
        System.out.println("Given String is Valid Parentheses? " +ans);
    }

     public static boolean isValid(String s) {
        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.append(ch);
            } else {
                if (stack.length() == 0) return false;

                char last = stack.charAt(stack.length() - 1);
                if ((ch == ')' && last != '(') ||
                    (ch == '}' && last != '{') ||
                    (ch == ']' && last != '[')) {
                    return false;
                }

                // Pop the matching opening bracket
                stack.deleteCharAt(stack.length() - 1);
            }
        }

        return stack.length() == 0;
    }
}