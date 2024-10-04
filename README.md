# Data Structure in Java

## 1. List
A List is an ordered collection that allows duplicate elements. It provides control over where elements are inserted and can access elements by their index.

**Implementations:**
- **ArrayList:** Uses a dynamic array to store elements.
- **LinkedList:** Uses a doubly-linked list.

```java
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

        // Using LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Frog");
        System.out.println("LinkedList Elements:");
        for (String animal : linkedList) {
            System.out.println(animal);
        }
    }
}
```
