# Lambda Expressions in Java and Kotlin

Lambda expressions are a key feature of functional programming that allow you to create anonymous functions, i.e. functions without a name, and pass them around as if they were objects. They are particularly useful for situations where you need a concise way to represent an implementation of a single-method interface (functional interface) or a function that you intend to use only once.

## Theory

Lambda expressions in Java and Kotlin provide a way to write short blocks of code that can be treated as instances of functional interfaces. The basic syntax of lambda expressions varies slightly between Java and Kotlin, but the underlying concepts are similar.

### Key Concepts

1. **Functional Interface**: An interface with exactly one abstract method. Both Java and Kotlin use functional interfaces to define what a lambda expression will implement.

2. **Syntax**:
    - **Java**: `(parameters) -> expression` or `(parameters) -> { statements; }`
    - **Kotlin**: `(parameters) -> expression` or `{ parameters -> statements }`

3. **Scope and Context**: Lambda expressions can access local variables and parameters from the scope in which they are defined, provided these variables are effectively final.

4. **Use Cases**: Commonly used in scenarios involving collections (e.g., filtering, mapping, reducing), event handling, and callback functions.

## Java Lambda Expression

In Java, lambda expressions were introduced in Java 8 and are used primarily with functional interfaces.

**Example of Java Lambda Expression:**

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample {
    public static void main(String[] args) {
        // Define a list of strings
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

        // Use a lambda expression to filter names that start with 'J'
        Predicate<String> startsWithJ = name -> name.startsWith("J");

        // Print names that match the predicate
        names.stream()
             .filter(startsWithJ)
             .forEach(System.out::println);
    }
}

## Explanation

**Java Lambda Expression**:

- `Predicate<String> startsWithJ = name -> name.startsWith("J");` is a lambda expression implementing the `Predicate` functional interface. It defines a condition that checks if a string starts with the letter "J".

- `names.stream().filter(startsWithJ).forEach(System.out::println);` uses the lambda expression to filter the list of names. It applies the `startsWithJ` predicate to each element in the stream, retaining only those that meet the condition (names starting with "J"), and then prints each matching name to the console.
