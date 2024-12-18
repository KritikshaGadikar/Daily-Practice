# Hexagonal Architecture

Hexagonal Architecture, also known as Ports and Adapters, is a software design pattern that promotes the separation of concerns, ensuring that business logic is decoupled from external systems and frameworks. It was introduced by Alistair Cockburn to address the complexities of maintaining tightly coupled applications.

## Key Concepts

### 1. **Core (Domain Layer)**
   - The heart of the application where the business rules and logic reside.
   - Independent of any external systems or frameworks.
   - Contains entities, value objects, and domain services.

### 2. **Ports**
   - Interfaces that define communication between the core and the external systems.
   - Two types of ports:
     - **Inbound Ports**: Handle input into the core (e.g., use cases or application services).
     - **Outbound Ports**: Handle output from the core to external systems (e.g., repositories, APIs).

### 3. **Adapters**
   - Implementations of the ports that interact with external systems.
   - Two types of adapters:
     - **Inbound Adapters**: Facilitate input into the application (e.g., controllers, APIs, message listeners).
     - **Outbound Adapters**: Facilitate output to external systems (e.g., databases, message queues, external services).

### 4. **External Systems**
   - Systems that interact with the application, such as databases, third-party APIs, and user interfaces.
   - These are decoupled from the core logic by adapters.

## Architecture Diagram

```
+-------------------+    +---------------------+
| Inbound Adapters  |    | Outbound Adapters   |
| (e.g., Controllers|    | (e.g., Repositories |
|  or APIs)         |    |  or External APIs)  |
+-------------------+    +---------------------+
         |                         ^
         v                         |
+-------------------+    +---------------------+
|    Inbound Port   |    |    Outbound Port    |
|  (Use Cases)      |    |   (Interfaces)      |
+-------------------+    +---------------------+
         |                         ^
         +-------------------------+
                   |
                   v
         +-------------------+
         |      Domain       |
         | (Business Logic)  |
         +-------------------+
```

## Benefits

1. **Separation of Concerns**: The core logic is isolated from the infrastructure, making it easier to maintain and test.
2. **Flexibility**: Adapters can be swapped without affecting the core.
3. **Testability**: The domain layer can be tested independently of external systems.
4. **Scalability**: Easier to add new features or integrate with additional systems.
5. **Technology Agnostic**: The core does not depend on specific frameworks or technologies.

## Implementation Steps

### Step 1: Define the Core
- Identify the core business logic and encapsulate it in the domain layer.
- Create entities, value objects, and domain services.

### Step 2: Define Ports
- Identify the interactions the core will have with external systems.
- Define interfaces (ports) for these interactions.

### Step 3: Create Adapters
- Implement inbound adapters to handle input (e.g., REST controllers, CLI).
- Implement outbound adapters to handle output (e.g., database repositories, third-party APIs).

### Step 4: Wire the Components
- Use a dependency injection framework or manual wiring to connect the ports and adapters.

## Example

### Domain Layer
```kotlin
// Entity
data class Customer(val id: String, val name: String, val email: String)

// Service
class CustomerService(private val customerRepository: CustomerRepository) {
    fun getCustomerDetails(id: String): Customer {
        return customerRepository.findById(id)
    }
}

// Outbound Port
interface CustomerRepository {
    fun findById(id: String): Customer
}
```

### Outbound Adapter
```kotlin
class CustomerRepositoryImpl : CustomerRepository {
    override fun findById(id: String): Customer {
        // Simulate database interaction
        return Customer(id, "John Doe", "john.doe@example.com")
    }
}
```

### Inbound Adapter
```kotlin
@RestController
@RequestMapping("/customers")
class CustomerController(private val customerService: CustomerService) {

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: String): ResponseEntity<Customer> {
        val customer = customerService.getCustomerDetails(id)
        return ResponseEntity.ok(customer)
    }
}
```

### Wiring Components
```kotlin
@Configuration
class AppConfig {

    @Bean
    fun customerRepository(): CustomerRepository = CustomerRepositoryImpl()

    @Bean
    fun customerService(customerRepository: CustomerRepository): CustomerService =
        CustomerService(customerRepository)
}
```

## Conclusion

Hexagonal Architecture provides a structured approach to building maintainable and scalable applications by separating business logic from external systems. By following its principles, teams can achieve flexibility, improved testability, and reduced technical debt.
