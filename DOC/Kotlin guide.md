# 1. Kotlin Basics
   ## Variables and Data Types
   ### Kotlin has two types of variables:

- val (immutable): Once assigned, it cannot be changed (like final in Java).
- var (mutable): Can be reassigned later.

```kotlin

val name: String = "Alice"  // Immutable (can't change later)
var age: Int = 25           // Mutable (can change later)

```
## Primitive Data Types
### Kotlin has standard primitive types:

## Numeric types: Int, Long, Float, Double, Short, Byte
## Others: Char, Boolean, String
``` kotlin

val number: Int = 42        // Integer
val pi: Double = 3.14       // Floating-point number
val isActive: Boolean = true
val letter: Char = 'A'

```

## String Interpolation
### You can embed variables or expressions inside a string using $:

```kotlin

val name = "John"
val greeting = "Hello, $name!"         // Outputs: Hello, John!
val fullGreeting = "Hello, ${name.uppercase()}!"

```

## Type Inference
### Kotlin automatically infers types if not explicitly declared:

```kotlin

val name = "Alice"  // Kotlin infers String
var age = 25        // Kotlin infers Int

```

# 2. Functions(in kotlin function are also called as Method)
   ## Basic Function Declaration
   ### Kotlin functions are declared using the fun keyword.

### The general structure of a function in Kotlin is as follows:

``` kotlin

fun functionName(parameter1: Type1, parameter2: Type2): ReturnType {
// Function body
return someValue
}

```

```kotlin

fun add(a: Int, b: Int): Int {
return a + b
}

```


## Single-expression Functions
### For short functions, you can omit the return and curly braces, making them more concise.

```kotlin

fun add(a: Int, b: Int) = a + b  // Concise syntax

```

## Default Parameters
### You can assign default values to parameters, which makes arguments optional:

```kotlin

fun greet(name: String = "Guest") {
println("Hello, $name!")
}
greet()              // Prints: Hello, Guest!
greet("Alice")       // Prints: Hello, Alice!

```

## Named Arguments
### When calling a function, you can explicitly name the arguments, useful when you skip default parameters:

```kotlin

fun greet(name: String = "Guest", age: Int = 30) {
println("Hello, $name, age $age")
}
greet(age = 25)     // Prints: Hello, Guest, age 25

```

# 3. Control Flow
## If-Else Statements
### if is an expression in Kotlin, meaning it returns a value:

```kotlin

val max = if (a > b) a else b

```

```kotlin

val isEven = if (number % 2 == 0) "Even" else "Odd"

```

## When Expression (Replacement for switch)
### The when statement in Kotlin is a powerful replacement for switch in other languages. It is an expression, meaning it can return values:

```kotlin

val number = 3
val result = when (number) {
1 -> "One"
2 -> "Two"
3 -> "Three"
else -> "Unknown"
}

```
## You can also match types:

```kotlin

fun checkType(x: Any) {
when (x) {
is Int -> println("$x is an integer")
is String -> println("$x is a string")
else -> println("Unknown type")
}
}

```

## For Loops
### Kotlin's for loop works with any iterable, such as ranges, arrays, or collections:

``` kotlin

for (i in 1..5) {
println(i)  // Prints numbers from 1 to 5
}

val items = listOf("apple", "banana", "orange")
for (item in items) {
println(item)
}

```

## While and Do-While Loops
### Kotlin supports while and do-while loops:

``` kotlin

var i = 0
while (i < 5) {
println(i)
i++
}

do {
println("Executed at least once")
} while (false)
```

# 4. Object-Oriented Programming
## Classes and Objects
### Basic Class Declaration
### Kotlin classes are declared using the class keyword:

```kotlin

class Person {
var name: String = "John"
var age: Int = 30

    fun introduce() {
        println("Hi, I'm $name and I'm $age years old.")
    }
}

```

## Constructor Initialization
### You can initialize class properties in the constructor:

```kotlin

class Car(val brand: String, val year: Int)
val car = Car("Toyota", 2020)
println(car.brand)  // Toyota

```


## Visibility Modifiers
### Classes, objects, and members can have visibility modifiers:

- public (default): Visible everywhere
- private: Visible only inside the containing class or file
- protected: Visible in the class and its subclasses
- internal: Visible only within the same module

## Data Classes
### Kotlin data classes automatically generate common methods like equals(), hashCode(), and toString():

```kotlin

data class User(val name: String, val age: Int)
val user1 = User("Alice", 25)
println(user1)  // Prints: User(name=Alice, age=25)

```

# 5. Collections
## Lists
### Lists are used to store ordered collections of items. Kotlin has both immutable (List) and mutable (MutableList) collections.

```kotlin

val fruits = listOf("Apple", "Banana", "Orange")  // Immutable list
val mutableFruits = mutableListOf("Apple", "Banana")
mutableFruits.add("Orange")                      // Mutable list

```

## Sets
### A set is a collection that contains no duplicate elements:

```kotlin

val numbers = setOf(1, 2, 3, 1)   // Set only keeps unique items

```

## Maps
### Maps are collections of key-value pairs:

```kotlin

val map = mapOf("key1" to "value1", "key2" to "value2")  // Immutable
val mutableMap = mutableMapOf("key1" to "value1")
mutableMap["key3"] = "value3"                           // Add new key-value

```

# 7. Higher-Order Functions and Lambdas
## 7.1 Lambdas
### A lambda is an anonymous function:

```kotlin

val multiply = { a: Int, b: Int -> a * b }
println(multiply(2, 3))  // Output: 6

```

## 7.2 Higher-Order Functions
### Functions that take other functions as parameters or return them:

```kotlin

fun operate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
return operation(x, y)
}

val sum = operate(4, 3) { a, b -> a + b }
println(sum)  // Output: 7

```

# 7. Null Safety
## Nullable Types
### In Kotlin, the type system distinguishes between nullable and non-nullable types. Use ? to mark a type as nullable:

```kotlin

var name: String? = "John"  // Nullable type
name = null  // Allowed because name is nullable

```

## Safe Calls and Elvis Operator
### Safe Call (?.): Executes an operation only if the value is non-null:
```kotlin

val length = name?.length

```
## Elvis Operator (?:): Provides a default value if the expression is null:
```kotlin

val length = name?.length ?: 0  // If name is null, length will be 0

```