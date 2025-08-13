import java.util.Stack;

class MinStack {
    private static class Pair {
        int value;
        int minSoFar;
        Pair(int value, int minSoFar) {
            this.value = value;
            this.minSoFar = minSoFar;
        }
    }

    private Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Pair(val, val));
        } else {
            int currentMin = Math.min(val, stack.peek().minSoFar);
            stack.push(new Pair(val, currentMin));
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().minSoFar;
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(5);
        System.out.println(ms.getMin()); // 3
        ms.push(2);
        ms.push(1);
        System.out.println(ms.getMin()); // 1
        ms.pop();
        System.out.println(ms.getMin()); // 2
    }
}
