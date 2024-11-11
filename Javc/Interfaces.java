Key Rules for Interface Modifiers in Java:
- Interface methods are implicitly public and abstract (before Java 8). Starting from Java 8, they can also be default or static.
- Interface variables are implicitly public, static, and final.
- An interface itself can be declared as public or abstract (implicitly abstract).
- Invalid modifiers for an interface or its methods include private, protected, final, synchronized, strictfp, and native.
Exam Question Example:

Question:1.
Consider the following interface definition:
public interface Animal {
    private void sound();            // Line 1
    protected static final int AGE = 5; // Line 2
    public abstract final void run(); // Line 3
}

What is the result of compiling the code above?

A. Compilation fails due to an invalid modifier on Line 1.
B. Compilation fails due to an invalid modifier on Line 2.
C. Compilation fails due to an invalid modifier on Line 3.
D. Compilation fails due to invalid modifiers on Lines 1, 2, and 3.

Answer:

D. Compilation fails due to invalid modifiers on Lines 1, 2, and 3.

Explanation:
Line 1 (private void sound();): Interface methods cannot be private because all methods in an interface are implicitly public and should be accessible to the implementing class.
Line 2 (protected static final int AGE = 5;): Interface variables are implicitly public, static, and final. Declaring it as protected is invalid.
Line 3 (public abstract final void run();): Interface methods cannot be final because they are meant to be overridden by implementing classes. Using final here is illegal.


Key Points for Interface-Related Exam Questions:
Modifiers for interface methods:

Valid: public, abstract, default, static.
Invalid: private (for pre-Java 9), protected, final, synchronized, strictfp, native.
Modifiers for interface fields:

Fields must always be public static final (implicitly).
Modifiers for interface declaration:

An interface itself can only have public or abstract modifiers (though abstract is implied and doesn't need to be explicitly written).


Example of Correct Interface Usage:

// Correct: Interface with public and abstract methods
public interface Animal {
    int AGE = 5; // implicitly public, static, and final
    void sound(); // implicitly public and abstract
    default void sleep() { // valid default method introduced in Java 8
        System.out.println("Sleeping...");
    }
}

In this correct example:

The variable AGE is implicitly public static final.
The method sound() is implicitly public and abstract.
The method sleep() is a valid default method introduced in Java 8.
