# Design-Patterns
Notes/examples from my study of design patterns

## Preface
To understand the importance, pros, and cons of each design pattern, I think that it is also important to include a section of notes about SOLID design principles, because at times, design patterns compromise one of the SOLID design principles, in-order to more strictly enforce another SOLID deisign principle. 

I plan to takes notes on several important design patterns from a wide varitey of resources. Studies materials will be added in the "Resources" sections as necessary. 

## SOLID

### Single Responsibility Principle

> Each component should be responsible for a single part or functionality of the system

> Each Git commit should be pertain to a single task or user-story

### Open-Close Principle

> Software components should be open for extension, but not for modification

### Liskov Substitution Principle

> Objects of a superclass should be replaceable with objects of its subclasses without breaking the system

### Interface Segregation Principle

> No client should be forced to depend on methods that it does not use/need

### Dependency Inversion Principle

> High-level modules should not depend on low-level modules, both should depend on abstractions

> TODO: add more here

## Types of Design Patterns
   1) Creational
      > These patterns are deisgned for calss instantiation. They can be either class-creation patterns or object-creational patterns.
   2) Structural
      > Designed with regard to a class's structure and composition. The main goal of most of these patterns is to increase the functionality of the class(es) involved, without changing much of its composition
   3) Behavioral
      > Designed depending on how one class communicates with others

## Strategy
   * About utilizing composition rather than inheritance
   * "Defines a family of algorithms encapsulated each one and makes them interchangeable"
   * With only inheritance, it is not feasible to share behavior with neighboring nodes in a inheritance tree with inheritance, however, using the Strategy Pattern, behavior is abstracted out and allows for the sharing of behavior between neighboring nodes in an inheritance tree

## Decorator
   * Great for adding functionality to an object at runtime
   * Flexible alternative to sub-classing
   * Provides flexibility by allowing the program to mix/match/repeat the layering of decorators

## Observer

## Resources
   * https://www.youtube.com/watch?v=_BpmfnqjgzQ
   * https://www.freecodecamp.org/news/the-basic-design-patterns-all-developers-need-to-know/
   * https://www.educative.io/answers/what-are-the-solid-principles-in-java
   * TODO: Clean Code
   * TODO: Clean Architecture
