what is fucntional programming ?

####Functional programming (FP) is a programming paradigm that treats computation as the evaluation of mathematical functions and avoids changing state or mutable data. Here's a breakdown of key concepts:

- Pure Functions: Functions that, given the same input, always return the same output and have no side effects (e.g., modifying global variables or input arguments).

- Immutability: Data is immutable in functional programming. Once created, data cannot be modified, which helps avoid side effects and makes the program more predictable.

- First-Class and Higher-Order Functions: Functions in FP can be treated like any other variable. They can be passed as arguments to other functions, returned as values from other functions, and assigned to variables.

- Function Composition: Complex operations can be built by composing simpler functions together, similar to how mathematical functions can be combined.

- Declarative Programming: FP focuses on what to solve rather than how to solve it. This contrasts with imperative programming, which is more concerned with how to solve a problem step by step.

- No Side Effects: FP aims to minimize side effects, making functions easier to test and reason about since functions rely only on their input arguments.

- Recursion: Iteration in FP is often achieved through recursion rather than loops, as FP languages typically avoid mutable state.

##Benefits of Functional Programming:
- Easier Debugging and Testing: Due to the predictability of pure functions.
- Concurrency: Immutability and the lack of side effects make it easier to write concurrent programs.
- Modular and Reusable Code: FP encourages writing small, reusable functions, which can be easily combined

##Functional Programming in Kotlin:
Kotlin is a multi-paradigm language that supports functional programming features such as higher-order functions, lambdas, and immutability, allowing developers to leverage FP principles alongside object-oriented programming.

####Road map for functional programming:
- Lambda Expressions
- Functional interfaces
- Streams
- Default methods
- Optional class
- Date and Time API
