import java.util.Stack;

public class PrefixPostfix {
    public static String convert(String prefix) {
        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else { // operator
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = op1 + op2 + c;
                stack.push(temp);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String prefix = "*+AB-CD";
        System.out.println("Prefix  : " + prefix);
        System.out.println("Postfix : " + convert(prefix));
    }
}
