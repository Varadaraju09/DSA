import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack: "+stack);
        System.out.println("Stack Size: "+stack.size());
        System.out.println("Stack peek: "+stack.peek()); // Display top element
        stack.pop(); // Remove top element
        System.out.println("Stack Size: "+stack.size());
        System.out.println("Stack: "+stack);
        System.out.println(stack.empty());
    }
}
