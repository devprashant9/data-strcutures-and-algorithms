import java.util.*;

public class InfixPrefix {

    // Precedence function
    static int precedence(char c) {
        switch (c) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
            default: return -1;
        }
    }

    // Check if operator is right-associative
    static boolean isRightAssociative(char c) {
        return c == '^';
    }

    // Check if character is operand
    static boolean isOperand(char c) {
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z') ||
               (c >= '0' && c <= '9');
    }

    // Swap braces in string
    static String swapBraces(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '(') sb.append(')');
            else if (ch == ')') sb.append('(');
            else sb.append(ch);
        }
        return sb.toString();
    }

    // Infix to Postfix
    static String infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isOperand(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop();
            } else { // operator
                while (!stack.isEmpty() &&
                       (precedence(c) < precedence(stack.peek()) ||
                       (precedence(c) == precedence(stack.peek()) && !isRightAssociative(c)))) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Infix to Prefix
    static String infixToPrefix(String s) {
        // 1. Reverse string
        StringBuilder sb = new StringBuilder(s).reverse();
        String reversed = sb.toString();

        // 2. Swap braces
        String swapped = swapBraces(reversed);

        // 3. Get postfix of swapped
        String postfix = infixToPostfix(swapped);

        // 4. Reverse postfix to get prefix
        return new StringBuilder(postfix).reverse().toString();
    }

  
}
