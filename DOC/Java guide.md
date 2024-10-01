# Java Fundamentals

## 1. Introduction to Java
Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle). It is known for its platform independence, robustness, and versatility, making it widely used in web applications, mobile applications (Android), enterprise applications, and more.

### Key Features of Java
- **Platform Independence**: Write once, run anywhere (WORA) due to Java Virtual Machine (JVM).
- **Object-Oriented**: Supports encapsulation, inheritance, and polymorphism.
- **Robustness**: Strong memory management, exception handling, and type checking.
- **Security**: Built-in security features, including a security manager and bytecode verifier.
- **Multithreading**: Supports concurrent programming.
- **Rich API**: Extensive libraries for data structures, networking, I/O, and more.

---

## 2. Java Basics

### 2.1. Java Structure
Every Java application starts with a `main` method:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- public: Access modifier (can be accessed from anywhere).
- class: Keyword to define a class.
- main: Entry point of the application.
- String[] args: Parameter for command-line arguments.

## 2.2. Data Types

Java has two categories of data types: **primitive** and **reference** types.

### Primitive Data Types

| Type     | Size       | Description                                |
|----------|------------|--------------------------------------------|
| `int`    | 4 bytes    | Integer values.                            |
| `byte`   | 1 byte     | Small integer (range: -128 to 127).      |
| `short`  | 2 bytes    | Short integer (range: -32,768 to 32,767).|
| `long`   | 8 bytes    | Long integer (64-bit).                    |
| `float`  | 4 bytes    | Single-precision floating-point.          |
| `double` | 8 bytes    | Double-precision floating-point.          |
| `char`   | 2 bytes    | Single 16-bit Unicode character.          |
| `boolean`| 1 bit      | True or false.                            |

### Reference Data Types

Reference types include objects, arrays, and interfaces. They store references to the memory locations of the objects.


## 2.3. Variables

Variables in Java are declared with a specific data type:

```java
int age = 30;
String name = "Alice";
boolean isStudent = false;
```


## 2.4. Operators

Java supports various operators:

### 2.4.1. Arithmetic Operators
- `+` : Addition
- `-` : Subtraction
- `*` : Multiplication
- `/` : Division
- `%` : Modulus

### 2.4.2. Relational Operators
- `==` : Equal to
- `!=` : Not equal to
- `>`  : Greater than
- `<`  : Less than
- `>=` : Greater than or equal to
- `<=` : Less than or equal to

### 2.4.3. Logical Operators
- `&&` : Logical AND
- `||` : Logical OR
- `!`  : Logical NOT

### 2.4.4. Assignment Operators
- `=`  : Assign
- `+=` : Add and assign
- `-=` : Subtract and assign
- `*=` : Multiply and assign
- `/=` : Divide and assign

### 2.4.5. Unary Operators
- `++` : Increment
- `--` : Decrement

## 3. Control Flow Statements

### 3.1. Conditional Statements

```java
int number = 10;

if (number > 0) {
    System.out.println("Positive");
} else if (number < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

### 3.2. Switch Statement

```java

int day = 3;
switch (day) {
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
default:
System.out.println("Invalid day");
}
```

## 3.3. Loops

### For Loop

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration " + i);
}
```

### While Loop
```java

int i = 0;
while (i < 5) {
System.out.println("Iteration " + i);
i++;
}

```


### Do-While Loop
```java

int j = 0;
do {
System.out.println("Iteration " + j);
j++;
} while (j < 5);
```

# 4. Methods
## 4.1. Method Declaration
### Methods are defined using the returnType methodName(parameters) syntax:

```java

public int add(int a, int b) {
return a + b;
}
```

## 4.2. Method Overloading
### You can define multiple methods with the same name but different parameters:

```java

public int add(int a, int b) {
return a + b;
}

public double add(double a, double b) {
return a + b;
}
```

## 4.3. Static Methods
### Static methods belong to the class rather than instances of the class:

```java

public static void printMessage() {
System.out.println("Hello from static method!");
}
```

# 5. Object-Oriented Programming (OOP)
## 5.1. Classes and Objects
### A class is a blueprint for creating objects.

```java
public class Car {
String color;
int year;

    void displayDetails() {
        System.out.println("Car color: " + color + ", Year: " + year);
    }
}

Car myCar = new Car();
myCar.color = "Red";
myCar.year = 2020;
myCar.displayDetails();
```

# 5.2. Constructors
## Constructors are special methods called when an object is created:

```java
public class Person {
String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }
}

Person person = new Person("Alice");
System.out.println(person.name);
```

# 5.3. Inheritance
## Inheritance allows a class to inherit properties and methods from another class:

```java
public class Animal {
void makeSound() {
System.out.println("Animal sound");
}
}

public class Dog extends Animal {
void makeSound() {
System.out.println("Bark");
}
}

Dog dog = new Dog();
dog.makeSound();  // Output: Bark
```

# 5.4. Polymorphism
## Polymorphism allows methods to do different things based on the object:

```java
Animal myDog = new Dog();
myDog.makeSound();  // Output: Bark
```

# 5.5. Encapsulation
## Encapsulation restricts access to class members:

```java
public class BankAccount {
private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

# 5.6. Abstraction
## Abstraction hides complex implementation details:

```java
abstract class Shape {
abstract void draw();
}

class Circle extends Shape {
void draw() {
System.out.println("Drawing Circle");
}
}

Shape shape = new Circle();
shape.draw();  // Output: Drawing Circle
```

# 6. Interfaces
## Interfaces define a contract for classes to implement:

```java
interface Animal {
void makeSound();
}

class Cat implements Animal {
public void makeSound() {
System.out.println("Meow");
}
}

Animal cat = new Cat();
cat.makeSound();  // Output: Meow
```

# 7. Exception Handling
## Java uses try-catch blocks for exception handling.

```java
try {
int result = 10 / 0;  // Throws ArithmeticException
} catch (ArithmeticException e) {
System.out.println("Cannot divide by zero!");
} finally {
System.out.println("Finally block executed.");
}
```

## 7.1. Custom Exceptions
### You can create custom exceptions by extending Exception.

```java
class InvalidAgeException extends Exception {
public InvalidAgeException(String message) {
super(message);
}
}

public void setAge(int age) throws InvalidAgeException {
if (age < 0) {
throw new InvalidAgeException("Age cannot be negative");
}
}
```

# 8. Collections Framework
## Java provides a Collections Framework for storing and manipulating groups of objects.

## 8.1. List
### An ordered collection that allows duplicates.

```java
import java.util.ArrayList;
import java.util.List;

List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
System.out.println(names);  // Output: [Alice, Bob]
```

## 8.2. Set
### An unordered collection that does not allow duplicates.

```java
import java.util.HashSet;
import java.util.Set;

Set<String> uniqueNames = new HashSet<>();
uniqueNames.add("Alice");
uniqueNames.add("Alice");  // Duplicate, will not be added
System.out.println(uniqueNames);  // Output: [Alice]
```

## 8.3. Map
### A collection of key-value pairs.

```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> ages = new HashMap<>();
ages.put("Alice", 30);
ages.put("Bob", 25);
System.out.println(ages);  // Output: {Alice=30, Bob=25}
```
