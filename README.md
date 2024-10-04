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

*Question:*
```java
List<String> arrayList = new ArrayList<>();
List<String> linkedList = new LinkedList<>();
```
- What's the difference between java.util.List and java.util.ArrayList or java.util.LinkedList?
	**1. Interface vs Class**
	- `java.util.List` is an interface that defines a collection that maintains the order of its elements.
	- Methods defined in `List` are general, like `add()`, `remove()`, `get()`, etc., but it does not provide any implementation of these methods. Common implementations of `List` include `ArrayList`, `LinkedList`, and `Vector`.
	- `java.util.ArrayList` and `java.util.LinkedList` are concrete classes that implement the `List` interface.

	**2. Usage and Flexibility**
	- Since `List` is an interface, you cannot directly instantiate it. You can declare a reference of type `List`, but you must assign it an instance of a class that implements `List`, such as `ArrayList`, `LinkedList`, etc.
		```java
		List<String> list = new ArrayList<>();
		```
	- You can directly instantiate an `ArrayList`, as it is a concrete class:
		```java 
		ArrayList<String> arrayList = new ArrayList<>();
		```
	- However, it is generally preferred to use the `List` interface type for flexibility. Using `List` provides flexibility because you can switch between different list implementations (like `ArrayList`, `LinkedList`, `CopyOnWriteArrayList`) without modifying your code beyond the instantiation.
	
	**3. Performance and Characteristics**
	- Being an interface, `List` does not define performance characteristics. The behaviour and performance depend on the specific implementation used (e.g., `ArrayList` has fast random access, while `LinkedList` is better for frequent insertions/removals).

- Why there is no type name inside `<>` after `ArrayList`
	- Before Java 7 (without the diamond operator), when you declared and instantiated a generic type, you had to specify the type twice, like this:
		```java
		List<String> list = new ArrayList<String>();
		```
	- Java 7 and Later (with the diamond operator <>), With the introduction of the diamond operator, Java can automatically infer the type parameter from the context, making the code cleaner and less repetitive:
		```java
		List<String> list = new ArrayList<>();
		```
		- The compiler looks at the left-hand side (`List<String> list`) and sees that `list` is supposed to be of type `String`.
		- Since the type `String` is already specified in the declaration, the compiler knows that the `ArrayList` should hold `String` elements. Thus, it can infer the type without needing it to be explicitly specified again on the right-hand side.
		- The `<>` (diamond operator) tells the compiler to infer the type from the context.
