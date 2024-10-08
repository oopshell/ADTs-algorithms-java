import java.util.Queue;
import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue Poll: " + queue.poll());
    }
}

