import java.util.Stack;

public class PostfixPrefix {
    public static String convert(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else { // operator
                String op2 = stack.pop();
                String op1 = stack.pop();
                String temp = c + op1 + op2;
                stack.push(temp);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String postfix = "AB+CD-*";
        System.out.println("Postfix : " + postfix);
        System.out.println("Prefix  : " + convert(postfix));
    }
}
