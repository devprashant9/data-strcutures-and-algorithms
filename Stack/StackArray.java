package Stack;

public class StackArray {
    static int top = -1; // index of last pushed element
    static int[] arr = new int[10];

    public static void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = data;
    }

    public static int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }
        top--;
    }

    public static void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        printStack(); // 30 20 10
        pop();
        printStack(); // 20 10
        System.out.println("Top: " + peek()); // 20
    }
}
