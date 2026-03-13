public class StringStack {

    private static final int MAX_SIZE = 10;
    private String[] arr = new String[MAX_SIZE];
    private int top = -1; // Stack is initially empty

    // 1. IsEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    // 2. IsFull
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    // 3. Push
    public void push(String data) {
        if (isFull()) {
            System.out.println("Stack Overflow. Can't add more elements");
            return;
        }
        arr[++top] = data;
        System.out.println("The String: " + data + " was pushed to stack.");
    }

    // 4. Pop
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Can't remove the element");
            return null;
        }
        String popped = arr[top--];
        return popped;
    }

    // 5. Display
    public void diplay() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. No elements to display");
        }
        System.out.println("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return top + 1;
    }

    public String peek() {
        // Intention is to fetch the top element -> no delete it
        if (isEmpty()) {
            System.out.println("Stack Underflow. Can't retrieve top.");
            return null;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        StringStack stack = new StringStack();
        stack.pop();

        stack.push("Mango");
        stack.push("Pine Apple");
        stack.push("Avocado");
        stack.push("Apple");
        stack.diplay();
        System.out.println("Top Element: " + stack.peek());
        String popped = stack.pop();
        System.out.println("Popped Element: " + popped);
        System.out.println();
        stack.diplay();
        System.out.println("Size of Stack: " + stack.size());
    }
}
