## The Factory Pattern
- It's a **creational design pattern**  used to create objects without specifying their exact class.
- It hides/encapsulates object creation logic from client.
- The client interacts with objects through a **common interface** or **abstract class**.

![Factory_Pattern](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/imkulwant/design-patterns/main/factory/src/main/resources/factory-pattern.puml)

## Key Components
- **Product Interface/Abstract Class**: Defines the common structure for objects created by the factory.
- **Concrete Products**: Specific implementation of the product interface.
- **Factory Class**: Responsible for creating and returning the appropriate object based on input parameters.

![factory-pattern.png](src/main/resources/factory-pattern.png)

## Advantages
- **Encapsulation**: Hides object creation logic.
- **Flexibility**: Allows runtime decision-making.
- **Decoupling**: Separates client code from object creation.

## When to Use It?
- When we need to create objects based on conditions at runtime.
- When object creation involves complex logic that we want to centralize.
