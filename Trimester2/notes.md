**Classes** template / blueprint


Note:
1. *object* must be created to access a *class*
2. Ideally a program must contain one class as the public class, usually containing the main function


A **Constructor** initializes a object that doesn't exist. A Method does operations on an already created object.


Scanner sc = new Scanner();
# Scanner = class
# sc = object -- references/pointers used to point at the class object
# Scanner() = default constructor function


!! Creating a class will create a constructor function by default
The constructor will not return anything (no value, not void)


__________________


**Abstraction** in Java refers to hiding the implementation details of a code and exposing only the necessary information to the user.


NOTE:
1. an object must be created to call a function, to create that object another function must be called --- ends up in an infinite loop, to break this loop,
    ***static*** keyword is used -- does not require any object to be formed.
2. ## static functions belong to the class, while non-static functions belong to an object of the class ##
3. non static methods cannot be accessed from static context


# *this* keyword:
It refers to the current object in a method or constructor. The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).


NOTE: code optimisation is not only about optimising the space and time complexity but also making the code more
1. Maintainable => make the code loosely coupled
2. Extensible


*Tightly coupled code:* one part of the code is being used directly in other parts of the code


# Single Responsibility Principle:
-- Becomes loosely coupled
One function must have just one purpose
All functions must have only one reason to be changed
Similarly, a class must be responsible for only one single entity


# Inheritance:
(use of ***extend*** keyword)
Inheritance in Java is a fundamental concept of object-oriented programming (OOP) that allows you to create a new class (subclass or child class) that inherits the properties and behaviors of an existing class (superclass or parent class)


Advantages:
-- Maintainable code
-- Extensible code


*NOTE:* A class cannot extend from more than one class (to avoid ambiguity) --- **Diamond Inheritance Problem**


__________________


# Log files:
=> a textual data file that stores events, processes, messages, and other data from applications, operating systems, or devices


**private** keyword:
1. A private member can only be accessed directly by other members (fields, methods) within the same class.
2. It hides the internal workings of a class and exposes only what is necessary (through public methods).


# Data Hiding or Encapsulation:
1. It restricts direct access to some of an object's components, which helps to protect the integrity of the data and prevent unintended interference.


# Polymorphism:
One object can belong to many other classes using inheritance
1. Run time polymorphism: we will get to know which object is passed only during runtime


# Interfaces -- explore!

