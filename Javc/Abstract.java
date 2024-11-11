// Abstract parent class Animal
public abstract class Animal {
    // Protected instance variable 'age', accessible to subclasses
    protected int age;

    // Concrete method 'eat' which prints a message when called
    public void eat() {
        System.out.println("Animal is eating");
    }

    // Abstract method 'getName', must be implemented by any subclass
    public abstract String getName();
}

// Concrete subclass Swan that extends Animal
public class Swan extends Animal {

    // Implementation of the abstract method 'getName' from Animal class
    // Returns the string "Swan"
    @Override
    public String getName() {
        return "Swan";
    }
}



1. Mixing Nonabstract Classes with Abstract Methods
What Could Appear in Exams:
Abstract Method in Concrete Class (Invalid Code): The exam might show you a concrete class with an abstract method and ask you to identify the error. This would result in a compile-time error because abstract methods can only exist in abstract classes.

Example:
// Invalid Code: Concrete class with an abstract method
public class Bird {
    public abstract void fly();  // Compiler error: abstract method in a non-abstract class
}
This code will not compile because a concrete class (Bird) cannot have an abstract method. The correct way would be to either make the class abstract or provide an implementation for the method.

Correct Version:
// Correct: Abstract class with an abstract method
public abstract class Bird {
    public abstract void fly();  // This is valid, since the class is abstract
}

Alternatively, make the method concrete:

// Correct: Concrete class with a concrete method
public class Bird {
    public void fly() {
        System.out.println("Bird is flying");  // Concrete method
    }
}

2. Questions with Methods Marked as Abstract with an Implementation
What Could Appear in Exams:
Abstract Method with an Implementation (Invalid Code): If an abstract method has an implementation (a method body), it is a compile-time error.

Example:

// Invalid Code: Abstract method with an implementation
public abstract class Animal {
    public abstract void makeSound() {
        System.out.println("Animal is making a sound");  // This will cause a compile-time error
    }
}
the method makeSound() is declared as abstract but also has an implementation, which is not allowed. Abstract methods are intended to be implemented by subclasses, not within the abstract class itself.

Correct Version:

// Correct: Abstract method with no implementation
public abstract class Animal {
    public abstract void makeSound();  // No method body (no implementation)
}

Alternatively, provide a concrete implementation:

// Correct: Concrete method in an abstract class
public abstract class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");  // Concrete method with a body
    }

Key Takeaways:
Abstract methods must always be declared inside abstract classes or interfaces.
A concrete class cannot contain abstract methods.
Abstract methods cannot have an implementation (method body). They are meant to be overridden in child classes.
Abstract classes can have both abstract and concrete methods.
When a subclass inherits an abstract class, it must implement all the abstract methods unless the subclass is also declared abstract.


Sample Exam Question for Scenario 1 (Mixing Nonabstract and Abstract):
Question:1.

public class Animal {
    public abstract void makeSound();
}
What is the result of compiling the above code?

A. Compilation fails because makeSound() must have a body.
B. The code compiles successfully.
C. Compilation fails because Animal must be declared as abstract.
D. Compilation fails because makeSound() cannot be public.

Answer:

C. Compilation fails because Animal must be declared as abstract.

Sample Exam Question for Scenario 2 (Abstract Method with Implementation):
Question:2.

public abstract class Bird {
    public abstract void fly() {
        System.out.println("Bird is flying");
    }
}
What is the result of compiling the above code?

A. Compilation fails because fly() cannot be abstract and have a body.
B. The code compiles successfully.
C. Compilation fails because fly() must be private.
D. Compilation fails because the fly() method is not final.

Answer:

A. Compilation fails because fly() cannot be abstract and have a body.