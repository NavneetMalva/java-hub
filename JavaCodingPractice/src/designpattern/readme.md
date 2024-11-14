<!-- TOC start (generated with https://github.com/derlin/bitdowntoc) -->

- [Q1: What is a design pattern in Java?](#q1-what-is-a-design-pattern-in-java)
- [Q2: Difference between design pattern and architectural pattern.](#q2-difference-between-design-pattern-and-architectural-pattern)
- [Q3: What are the types of design patterns in Java?](#q3-what-are-the-types-of-design-patterns-in-java)
- [Q4: What are the Creational Patterns?](#q4-what-are-the-creational-patterns)
- [Q5: What Is Factory Pattern?](#q5-what-is-factory-pattern)

<!-- TOC end -->

<!-- TOC --><a name="q1-what-is-a-design-pattern-in-java"></a>
### Q1: What is a design pattern in Java?
A design pattern refers to an established and verified solution for a repetitive issue in software development. It offers a standardized approach to solve common design problems and helps developers write maintainable, extensible, and reusable code.

<!-- TOC --><a name="q2-difference-between-design-pattern-and-architectural-pattern"></a>
### Q2: Difference between design pattern and architectural pattern.
Design patterns are like recipes for solving problems in software development. They are helpful because they provide ready-made and flexible solutions to common problems that software developers face. These solutions make the software better. Design patterns are focused on fixing problems in a specific type of software design, like how objects are organized and used.
Architectural patterns help us to organize how an application is built. They give us a framework for how everything fits together. They decide what things a big program is made of and how they work together. These patterns help us to make sure that our program is easy to change and can grow to handle lots of users. They also help us to keep our program safe.
<!-- TOC --><a name="q3-what-are-the-types-of-design-patterns-in-java"></a>
### Q3: What are the types of design patterns in Java?
There are four types of design patterns in Java:
- Creational
- Structural
- Behavioral
- J2EE

<!-- TOC --><a name="q4-what-are-the-creational-patterns"></a>
### Q4) What are the Creational Patterns?
Creational design patterns are related to the way of creating objects. Creational design patterns are used when a decision is made at the time of instantiation of a class.

`EmpRecord e1=new EmpRecord();`

Since new keyword is used to create an object in Java, So, here we are creating the instance using the new keyword. In some cases, the nature of the object must be changed according to the nature of the program. In such cases, we should use the creational design patterns to provide a more general and flexible approach.

<!-- TOC --><a name="q5-what-is-factory-pattern"></a>
### Q5) What Is Factory Pattern?
It is the most used design pattern in Java.
These design patterns belong to the Creational Pattern as this pattern provides one of the best ways to create an object.
In the Factory pattern, we don't expose the creation logic to the client and refer the created object using a standard interface.
Factory Pattern allows the sub-classes to choose the type of objects to create.
The Factory Pattern is also known as Virtual Constructor.