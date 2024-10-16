import java.util.PriorityQueue;

public class PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(50);
        priorityQueue.add(10);
        priorityQueue.add(30);
        System.out.println("PriorityQueue Poll: " + priorityQueue.poll()); // Outputs 10
    }
}
