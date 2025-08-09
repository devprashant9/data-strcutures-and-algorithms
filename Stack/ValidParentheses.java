package Stack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);

            // If opening bracket, push to stack
            if (ch1 == '(' || ch1 == '{' || ch1 == '[') {
                st.push(ch1);
            } 
            // If closing bracket, check match
            else {
                if (st.isEmpty()) {
                    return false; // No matching opening
                }

                char ch2 = st.pop();
                if (!((ch2 == '(' && ch1 == ')') ||
                      (ch2 == '{' && ch1 == '}') ||
                      (ch2 == '[' && ch1 == ']'))) {
                    return false; // Mismatch
                }
            }
        }

        // Stack should be empty if valid
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[{}()]";
        boolean res = isValid(s);
        System.out.println("The Given String is Valid? " + res);
    }
}
