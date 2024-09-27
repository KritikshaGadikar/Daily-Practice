# Mutation Testing

## What is Mutation Testing?

**Mutation Testing** is a method of software testing where small changes (mutations) are made to the code to assess the effectiveness of the existing test suite. The goal is to identify weaknesses in the test cases by intentionally introducing bugs (mutants) and seeing if the test suite can detect them.

### How it Works

1. **Mutants**: The original code is altered to create "mutants" by applying small changes (e.g., changing an operator, flipping a conditional, etc.).

2. **Run Tests**: The existing test suite is executed on both the original and mutated code.

3. **Kill Mutants**: If the tests fail when run on the mutated code, the mutant is said to be "killed", indicating that the test suite successfully detected the change.

4. **Surviving Mutants**: If the test suite passes on the mutated code, it means the test suite did not detect the change, and the mutant is said to "survive". This reveals that the test suite may be inadequate or missing certain edge cases.

### Types of Mutations

1. **AOR (Arithmetic Operator Replacement)**: Mutates arithmetic operators like `+`, `-`, `*`, `/`.
    - Example: `a + b` becomes `a - b`.

2. **ROR (Relational Operator Replacement)**: Mutates relational operators like `>`, `<`, `>=`, `<=`.
    - Example: `a > b` becomes `a < b`.

3. **COR (Conditional Operator Replacement)**: Mutates logical operators like `&&`, `||`.
    - Example: `if (a && b)` becomes `if (a || b)`.

4. **Statement Deletion**: Deletes a statement to see if the tests can catch the absence of critical functionality.
    - Example: Removing `return` in a function.

---

## Benefits of Mutation Testing

1. **Test Quality Evaluation**: Mutation testing helps identify weak or inadequate test cases that would otherwise pass undetected.

2. **Increased Coverage**: By generating mutants, mutation testing can highlight areas of code that are not being adequately tested, leading to better test coverage.

3. **Improved Confidence**: A suite that successfully kills most mutants provides confidence that the code is well-tested and unlikely to contain undetected bugs.

---

## Drawbacks of Mutation Testing

1. **Time-Consuming**: Mutation testing can be slow because it requires running the test suite multiple times (once for each mutant). For large codebases, this can be resource-intensive.

2. **False Positives/Negatives**: In some cases, tests might kill mutants for reasons unrelated to the actual mutation (false positives) or might not kill them due to inadequate test logic (false negatives).

3. **Difficult to Interpret**: Understanding why a mutant survived may not always be straightforward, especially in complex codebases.

---

## Mutation Testing Example

Consider the following simple Java method that calculates whether a number is even or odd:

```java
public class NumberChecker {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
```

## Original Test Case
```java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {
@Test
void testIsEven() {
NumberChecker checker = new NumberChecker();
assertTrue(checker.isEven(2));
assertFalse(checker.isEven(3));
}
}
```

## Mutation Testing Tools
1. Pitest (PIT)
   Language: Java
   Description: Pitest is one of the most widely used mutation testing frameworks for Java. It integrates well with existing build tools like Maven and Gradle.
   Website: Pitest

2. Stryker
   Language: JavaScript, TypeScript, Scala, .NET
   Description: Stryker is a mutation testing framework for JavaScript, TypeScript, Scala, and .NET. It provides extensive reporting and is easy to integrate with popular testing frameworks.
   Website: Stryker

3. MutMut
   Language: Python
   Description: MutMut is a mutation testing tool for Python that is simple to use and provides detailed output.
   Website: MutMut


## Best Practices for Mutation Testing

- Target Critical Code Paths: Focus mutation testing on important parts of the code, such as core business logic, to maximize its effectiveness.

- Use in Conjunction with Other Tests: Mutation testing should be used alongside other testing techniques like unit testing, integration testing, and functional testing for comprehensive test coverage.

- Run Periodically: Due to the computational cost, mutation testing can be run periodically (e.g., overnight or weekly) rather than on every commit in large projects.

- Automate Mutation Testing: Integrate mutation testing tools into your CI/CD pipeline to automatically generate reports on test suite effectiveness over time.

