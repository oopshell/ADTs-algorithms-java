import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        // Using HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2); // Duplicate, will not be added
        System.out.println("HashSet Elements: " + hashSet);

        // Using TreeSet
        Set<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet Elements: " + treeSet);
    }
}
