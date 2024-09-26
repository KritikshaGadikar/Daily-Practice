# SOLID Principles

**SOLID** is an acronym for five principles of object-oriented design that help developers build more maintainable, understandable, and flexible software. The principles were introduced by Robert C. Martin and are considered best practices for writing clean code.

## 1. Single Responsibility Principle (SRP)
A class should have **only one reason to change**, meaning it should have only one job or responsibility.

### Example
If you have a class `Invoice`, it should only handle the logic related to the invoice, like calculating totals. The responsibility for sending the invoice via email should be in a different class.

```java
// Good SRP Example
class Invoice {
    private List<Item> items;

    public double calculateTotal() {
        // logic for calculating total
    }
}

class InvoiceEmailer {
    public void sendInvoiceByEmail(Invoice invoice) {
        // logic for sending invoice via email
    }
}
```


## 2. Open/Closed Principle (OCP)
Software entities (classes, modules, functions) should be open for extension, but closed for modification. This means that the behavior of a class can be extended without modifying its source code.

### Example
If you want to add a new type of discount calculation without modifying the original class, you can achieve this with inheritance or interfaces.

```java

// Original class
abstract class Discount {
public abstract double applyDiscount(double amount);
}

// Extension without modifying original class
class ChristmasDiscount extends Discount {
@Override
public double applyDiscount(double amount) {
return amount * 0.8;
}
}

class NewYearDiscount extends Discount {
@Override
public double applyDiscount(double amount) {
return amount * 0.9;
}
}

```

## 3. Liskov Substitution Principle (LSP)
Objects of a derived class should be able to replace objects of the base class without altering the correctness of the program.

### Example
If Square is a subclass of Rectangle, substituting Square for Rectangle should not break the behavior.

```java

// Bad LSP Example
class Rectangle {
public int width;
public int height;

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    public int getArea() { return width * height; }
}

class Square extends Rectangle {
// Overrides both methods in a way that breaks LSP
@Override
public void setWidth(int width) {
this.width = width;
this.height = width;
}

    @Override
    public void setHeight(int height) { 
        this.width = height; 
        this.height = height; 
    }
```

## 4. Interface Segregation Principle (ISP)
Clients should not be forced to depend on interfaces they do not use. This means that instead of having one large interface, you should have multiple smaller, more specific interfaces.

### Example
If you have an interface with methods that not all implementations need, it's better to split the interface.

```java

// Bad ISP Example
interface Worker {
void work();
void eat();
}

// Good ISP Example
interface Workable {
void work();
}

interface Eatable {
void eat();
}

class Robot implements Workable {
@Override
public void work() {
// Robot working
}
}

class Human implements Workable, Eatable {
@Override
public void work() {
// Human working
}

    @Override
    public void eat() {
        // Human eating
    }
}
```

## 5. Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules. Both should depend on abstractions. Also, abstractions should not depend on details, but details should depend on abstractions.

### Example
Instead of having the EmailService depend on the concrete implementation of an email sender, you create an abstraction for email sending and depend on that.

```java

// Abstraction
interface EmailSender {
void sendEmail(String message);
}

// High-level module depends on abstraction
class EmailService {
private final EmailSender emailSender;

    public EmailService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void processEmail(String message) {
        emailSender.sendEmail(message);
    }
}

// Low-level module implementing the abstraction
class SmtpEmailSender implements EmailSender {
@Override
public void sendEmail(String message) {
// Logic to send email via SMTP
}
}
```
