# Design-Patterns
Notes/examples from my study of design patterns

## Preface
To understand the importance and the pros/cons of each design pattern, I think that it is also important to include a section of notes about SOLID design principles, because at times, design patterns compromise one of the SOLID design principles, in-order to more strictly enforce another SOLID deisign principle. 

I plan to takes notes on several important design patterns from a wide varitey of resources. Studies materials will be added in the "Resources" sections as necessary. 

## SOLID

### Single Responsibility Principle

> Each component should be responsible for a single part or functionality of the system

> Each Git commit should be pertain to a single task or user-story

### Open-Close Principle

> Software components should be open for extension, but closed for modification

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
   * Is about moving from a poll architecture to a push architecture
   * Instead of having the observer ask the observable if it has changed, we have the observable tell the observer that it has changed
   * Polling is when the observer(s) are responsible for asking if the observeable has changed its state
      * this can present several issues like: how often should we check for changes, when should we start checking for changes, when should we stop checking for changes
   * Pushing is when the observable is responsible for telling the observer(s) when it has changed

## Factory Method
   * Unlike Strategy where you have to construct the new object, the factory method abstracts away the construction of new objects at runtime
   * Abstracts away complex object generations
   * Is about polymorphism
   * Abstracts the business logic needed to create some kind of object
   * You have the things you are trying to create and the things that create them (Factories)
   * Lets a class defer instantiation to subclasses/concrete-factories
   * Good for when you don’t necessarily know how you want to construct an object, why you want to construct that object, and what parameters you want to pass when constructing that object

## Abstract Factory
   * TODO

## Singleton
   * Insures that a class only has one instance and provides a global access to that single instance
   * You make the constructor static private so that you can't construct the class outside of that class
   * You then make a static variable that holds the class object that is shared throughtout your program
   * Common arguments against Singleton pattern
      * Having to make the Singleton global makes it somewhat unpredictable. It could change without you indenting to. Whenever you leak to the global namespace, it could change without you knowing
      * You are making the assumption that you will only EVER need one instace of a class
      * Makes your code less flexible if you decide that you do not want your class to be a Singleton anymore
      * Diffficult testing
      * One man's constant is another man's variable 

## Command
   * Encapsulates a request as an object, thereby letting you parameterize other objects with different request, queue, or log requests and support undoable operations
   * We can take a bunch of the encapsulated commands and we can use the commands and pass them around to give some kind of context
   * You can make a list of commands and invoke them one at a time
   * Helpful for things like undo/redo stacks
   * You have a ICommand interface that specifies that each class implementing this interface must specify a void method for how it executes and unexecutes (undo)
   * Concrete Commands implement the exeute and unexecute methods, and have a specified Receiver. The command's exeute method will typically call one of the receiver's methods, or directly change one of it's values
   * You have an Invoker class, who maintains 0 to many ICommand(s)


## Resources
   * https://www.youtube.com/watch?v=_BpmfnqjgzQ
   * https://www.freecodecamp.org/news/the-basic-design-patterns-all-developers-need-to-know/
   * https://www.educative.io/answers/what-are-the-solid-principles-in-java
   * https://refactoring.guru/design-patterns/
   * TODO: Clean Code
   * TODO: Clean Architecture
