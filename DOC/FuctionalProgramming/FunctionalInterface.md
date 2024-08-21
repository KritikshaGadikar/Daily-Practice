# Functional Interfaces in Programming

A **functional interface** is an interface that has exactly one abstract method. They are used primarily in functional programming paradigms to represent single-method abstractions.

## Key Characteristics

### Single Abstract Method (SAM)

The defining feature of a functional interface is that it has exactly one abstract method. This allows instances of functional interfaces to be created with lambda expressions or method references, simplifying the code and improving readability.

### Java Functional Interfaces

In Java, functional interfaces are commonly used with lambda expressions and method references introduced in Java 8. Some of the built-in functional interfaces in the Java Standard Library include:

- `java.util.function.Function<T, R>`
- `java.util.function.Predicate<T>`
- `java.util.function.Consumer<T>`

### `@FunctionalInterface` Annotation

In Java, the `@FunctionalInterface` annotation is used to indicate that an interface is intended to be a functional interface. While this annotation is optional, it helps the compiler and developers ensure that the interface has exactly one abstract method.

## Example of a Functional Interface in Java

Here's an example of a functional interface:

```java
@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);

    // You can also have default methods or static methods
    default int add(int a, int b) {
        return a + b;
    }
    
    static int multiply(int a, int b) {
        return a * b;
    }
}
```
You can then use this interface with a lambda expression:

```java
Calculator add = (a, b) -> a + b;
Calculator multiply = (a, b) -> a * b;
```

Functional interfaces are a cornerstone of functional programming in Java, enabling more concise and readable code through lambda expressions and method references.