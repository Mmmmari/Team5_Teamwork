// EASY: Create an integer ArrayList, skip the first 5 numbers. And then with the rest of them, print them out.

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        numbers.add(1);   
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        
        numbers
            .stream()
            .skip(5) 
            .forEach(x -> Print(x));
    }    

    public static void Print(int number) { 
        System.out.println();
        System.out.println(number);
    }
}

// Medium: Create an integer ArrayList, make sure they divide by 2, skip the first 5, limit to three and print them out from another function.

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        numbers.add(2);   
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(16);

        List<Integer> result = numbers
            .stream()
            .filter(x -> x % 2 == 0)  // Filter condition for divisibility by 2
            .skip(5) 
            .limit(3)
            .collect(Collectors.toList());  // Collect the result into a new list

        Print(result);
    }    

    public static void Print(List<Integer> numbers) {
        System.out.println(numbers);
    }
}



// Extra: Read about Streams and the actions you can do with it.

From ChatGPT (a WALL of text): 

Sure! In Java, **Streams** are a powerful feature introduced in Java 8 that allow you to process sequences of elements (like collections) in a functional style. They provide a way to perform bulk operations on collections of data efficiently and concisely.

Here are some key points about Streams:

### What are Streams?

- **Stream**: A sequence of elements supporting sequential and parallel aggregate operations.
- **Not a data structure**: Streams do not store elements. They are a way to operate on data that is stored elsewhere.
- **Lazy**: Operations on a stream are not executed until a terminal operation is called. This allows for optimizations.

### Common Stream Operations

Stream operations can be classified into two main categories: **intermediate operations** and **terminal operations**.

#### Intermediate Operations
These operations transform a stream into another stream and are lazy (not executed immediately).

1. **`filter(Predicate<T> predicate)`**:
   - Returns a stream consisting of the elements that match the given predicate.
   - Example: `stream.filter(x -> x > 10)`

2. **`map(Function<T, R> mapper)`**:
   - Transforms each element of the stream by applying a function.
   - Example: `stream.map(x -> x * 2)`

3. **`flatMap(Function<T, Stream<R>> mapper)`**:
   - Transforms each element into a stream and flattens the resulting streams into one.
   - Example: `stream.flatMap(x -> Stream.of(x, x+1))`

4. **`sorted(Comparator<T> comparator)`**:
   - Returns a stream with elements sorted according to a comparator.
   - Example: `stream.sorted(Comparator.naturalOrder())`

5. **`distinct()`**:
   - Returns a stream with duplicate elements removed.
   - Example: `stream.distinct()`

6. **`limit(long maxSize)`**:
   - Truncates the stream to contain no more than the given number of elements.
   - Example: `stream.limit(5)`

7. **`skip(long n)`**:
   - Discards the first `n` elements of the stream.
   - Example: `stream.skip(3)`

#### Terminal Operations
These operations produce a result or a side-effect and mark the end of the stream.

1. **`forEach(Consumer<T> action)`**:
   - Performs an action for each element of the stream.
   - Example: `stream.forEach(System.out::println)`

2. **`collect(Collector<T, A, R> collector)`**:
   - Converts the stream into a different form, like a list or a set.
   - Example: `stream.collect(Collectors.toList())`

3. **`reduce(BinaryOperator<T> accumulator)`**:
   - Combines elements of the stream into a single result.
   - Example: `stream.reduce(0, (a, b) -> a + b)`

4. **`count()`**:
   - Returns the number of elements in the stream.
   - Example: `stream.count()`

5. **`anyMatch(Predicate<T> predicate)`**:
   - Returns `true` if any element matches the predicate.
   - Example: `stream.anyMatch(x -> x > 10)`

6. **`allMatch(Predicate<T> predicate)`**:
   - Returns `true` if all elements match the predicate.
   - Example: `stream.allMatch(x -> x > 0)`

7. **`noneMatch(Predicate<T> predicate)`**:
   - Returns `true` if no elements match the predicate.
   - Example: `stream.noneMatch(x -> x < 0)`

8. **`findFirst()`**:
   - Returns an `Optional` describing the first element of the stream.
   - Example: `stream.findFirst()`

9. **`findAny()`**:
   - Returns an `Optional` describing some element of the stream (useful in parallel streams).
   - Example: `stream.findAny()`

### Example Usage

Here’s a simple example that shows how to use some of these operations:

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filteredNumbers = numbers.stream()
            .filter(x -> x % 2 == 0) // Keep only even numbers
            .map(x -> x * x)         // Square each number
            .collect(Collectors.toList()); // Collect results into a list

        System.out.println(filteredNumbers); // Output: [4, 16, 36, 64, 100]
    }
}
```

In this example:
- We create a stream from the list of numbers.
- We filter out only the even numbers.
- We square each remaining number.
- We collect the results back into a list.

Streams make it easy to work with collections in a more readable and efficient way.





