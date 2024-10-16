import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        // Using HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 25);
        hashMap.put("Charlie", 35);
        System.out.println("HashMap Entries: " + hashMap);

        // Using TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap Entries: " + treeMap);
    }
}
