import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Popped: " + stack.pop()); // Output: 20
        System.out.println("Peek: " + stack.peek());  // Output: 10
    }
}
