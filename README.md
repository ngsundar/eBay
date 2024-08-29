# eBay
Prescreen   
Objective: Implement a simple, extensible calculator in Java that supports multiple operations. The implementation should adhere to key object-oriented principles, especially the Open-Closed Principle, and be designed with maintainability and extensibility in mind.
Requirements:
1. Operations: Define an enum named Operation that includes basic operations like ADD, SUBTRACT, MULTIPLY, and DIVIDE.
2. Basic Calculation Method: Implement a method calculate(Operation op, Number num1, Number num2) in the Calculator class that performs a single operation between two numbers and returns the result.
3. Chaining Operations: Implement a method that allows chaining multiple operations on a single value, similar to how basic calculators work. This should enable users to start with an initial value and perform a series of operations sequentially.
4. Extensibility: The Calculator class should allow new operations to be added without requiring changes to its existing code.
5. IoC Compatibility: Ensure the design is compatible with an Inversion of Control (IoC) environment, allowing for external management of dependencies to enable easy testing and swapping of implementations.
6. Error Handling: The solution should handle invalid operations gracefully (e.g., operations not supported by the calculator).
7. Testing: Write unit tests to verify your solution, including both normal cases and edge cases.

Clarification:
Enum Modification: Modifying the Operation enum to add new operations is allowed. The focus of the Open-Closed Principle should be on keeping the Calculator class itself unchanged when new operations are added.
Basic Calculation Method: The calculate method should take two numbers and an operation, and return the result of applying the operation to the two numbers. For
example, calculate(Operation.ADD, 2, 3) should return 5.
Chaining Functionality: The chaining method should allow users to start with an initial value and apply multiple operations in sequence. For example, starting with 5, the user should be able to add 3, then multiply by 2, and retrieve the final result.
Handling Unsupported Operations: If an operation is requested that isn't supported, the solution should handle this gracefully, either by throwing an exception or providing a meaningful error message.
