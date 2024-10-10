import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Start");
        deque.addLast("Middle");
        deque.addLast("End");
        System.out.println("Deque Remove First: " + deque.removeFirst());
        System.out.println("Deque Remove Last: " + deque.removeLast());
    }
}
