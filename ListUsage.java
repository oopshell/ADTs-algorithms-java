import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListUsage {
    public static void main(String[] args) {
        // Using ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList Element at index 1: " + arrayList.get(1));
    }
}
