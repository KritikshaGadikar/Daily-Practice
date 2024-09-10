# Step 1: Write a Kotlin Program
## Create a file named Main.kt with the following content:

# Main.kt

```kotlin
// Main.kt

##For example
fun main() {
    println("Hello, Kotlin!")  // This will print the output to the terminal
}
```

# Step 2: Compile and Run the Kotlin Program
### Compile and Run the Kotlin Program with JAR File

## Compile the Kotlin file:

bash
```kotlin
kotlinc Main.kt -include-runtime -d Main.jar
```
### The above command compiles the Main.kt file into a JAR file named Main.jar.

## Run the compiled program:

bash
```kotlin
java -jar Main.jar
```
After running this command, you should see the output:

## Output
Hello, Kotlin!
