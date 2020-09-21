# SOLIDPrinciples
* **S - Single-responsiblity principle**
  * Single Responsibility Principle forces you to put just one responsibility to a single class.
  * More responsiblities added to a class makes it a God Object (an object that knows too much or does too much). It is an example of anti-pattern.
  * > A class should have one and only one reason to change, meaning that a class should have only one job.
  * _Separation of concerns_ - different classes handling different/independent tasks or problems.
  
* **O - Open-closed principle** 
  * > A class should be open for extension and closed for modification
  
* **L - Liskov substitution principle** 
  * Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.
  * > All this is stating is that every subclass/derived class should be substitutable for their base/parent class.
  * Violation of Liskov substitution principle leads to incorrect code with inheritance.
  * **You should be able to substitute a base type for a subtype.**
  
* **I - Interface segregation principle**
  * Basically a recommendation on how to split interfaces into smaller interfaces.
  * It follows YAGNI = You Ain’t Gonna Need It principle
  * Instead of sticking everything into a single interface you should put the absolute minimum amount of code into an interface
  * > A client should never be forced to implement an interface that it doesn't use or clients shouldn't be forced to depend on methods they do not use.
  
* **D - Dependency Inversion Principle**
  * > High level modules should not depend on low-level modules. Both should depend on abstractions.
  * > Abstractions should not depend on details. Details should depend on abstractions.
