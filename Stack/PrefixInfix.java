import java.util.Stack;

public class PrefixToInfix {

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static String convert(String prefix) {
        Stack<String> stack = new Stack<>();

        // Traverse from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);

            // Ignore spaces
            if (ch == ' ') continue;

            if (isOperator(ch)) {
                // Pop top two elements
                String op1 = stack.pop();
                String op2 = stack.pop();

                // Form infix string
                String expr = "(" + op1 + ch + op2 + ")";
                stack.push(expr);
            } else {
                // Operand → push directly
                stack.push(String.valueOf(ch));
            }
        }

        // Final infix expression
        return stack.pop();
    }

    public static void main(String[] args) {
        String prefix = "*+ABC";
        String infix = convert(prefix);

        System.out.println("Prefix: " + prefix);
        System.out.println("Infix: " + infix);
    }
}
