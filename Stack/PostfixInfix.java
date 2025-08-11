import java.util.Stack;

public class PostfixToInfix {

    // Helper function to check if a character is an operator
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static String convert(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            // Ignore spaces
            if (ch == ' ') continue;

            if (isOperator(ch)) {
                // Pop top two operands
                String op2 = stack.pop();
                String op1 = stack.pop();
                
                // Form the infix string
                String expr = "(" + op1 + ch + op2 + ")";
                
                // Push back to stack
                stack.push(expr);
            } else {
                // Operand → push as a string
                stack.push(String.valueOf(ch));
            }
        }

        // The final element is the infix expression
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "ab+c*";
        String infix = convert(postfix);
        System.out.println("Postfix: " + postfix);
        System.out.println("Infix: " + infix);
    }
}
