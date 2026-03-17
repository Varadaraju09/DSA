// LeetCode 155
import java.util.*;

class MinStack {

    Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty())
            stack.push(new int[]{val, val});
        else
            stack.push(new int[]{val, Math.min(val, stack.peek()[1])});
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(2);
        ms.push(8);

        System.out.println("Min: " + ms.getMin()); // 2
        ms.pop();
        System.out.println("Top: " + ms.top());    // 2
    }
}
