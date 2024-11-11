// A custom exception class extending the built-in Exception class
public class InsufficientDataException extends Exception {
    // No specific code here; it just creates a custom exception
}

// Parent class: Reptile
public class Reptile {
    // Method to check if the reptile has legs.
    // It throws a checked exception 'InsufficientDataException'
    // meaning the calling code must handle this exception.
    protected boolean hasLegs() throws InsufficientDataException {
        // Throwing the custom exception directly, no other logic here.
        throw new InsufficientDataException();
    }
    
    // Method to get the weight of the reptile.
    // It throws a general checked exception 'Exception'
    // The return value is hardcoded as 2.
    protected double getWeight() throws Exception {
        return 2;
    }
}

// Child class: Snake, which extends Reptile
public class Snake extends Reptile {
    // This method overrides the hasLegs() method in Reptile.
    // The overridden method does NOT throw any exception.
    // This is valid because a subclass can remove exceptions in an overridden method.
    @Override
    protected boolean hasLegs() {
        // Returns false because snakes don't have legs.
        return false;
    }
    
    // This method overrides getWeight() in Reptile.
    // The parent method throws a general 'Exception', 
    // but this overridden method narrows it down to 'InsufficientDataException'.
    // This is also valid because narrowing down exceptions is allowed in overridden methods.
    @Override
    protected double getWeight() throws InsufficientDataException {
        // Returns 2 as the weight of the snake, same as the parent class.
        return 2;
    }
}




The getHeight() method in the parent class throws an InsufficientDataException, whereas the method in the child class throws an Exception. Since Exception is not
a subclass of InsufficientDataException, the third rule of overriding methods is
violated and the code will not compile. Coincidentally, Exception is a superclass of InsufficientDataException.
Next, the getLength() method doesn’t throw an exception in the parent class, but it does throw an exception, InsufficientDataException, in the child class. In this manner, the child class defines a new exception that the parent class did not, which is a violation of the third rule of overriding methods.
The last three rules of overriding a method may seem arbitrary or confusing at first, but as you’ll see later in this chapter when we discuss polymorphism, they are needed for con- sistency of the language. Without these rules in place, it is possible to create contradictions within the Java language.


public class InsufficientDataException extends Exception {}
public class Reptile {
protected double getHeight() throws InsufficientDataException {
return 2; }
protected int getLength() { return 10;
} }
public class Snake extends Reptile {
protected double getHeight() throws Exception { // DOES NOT COMPILE
return 2; }
protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE return 10;
} }




Explanation of Rules for Method Hiding and Overriding in Java

1. Same Signature in Child and Parent Class
class Parent {
    public static void print() { System.out.println("Parent"); }
}

class Child extends Parent {
    public static void print() { System.out.println("Child"); }  // Same signature
}

2. Access Level in Child Class Must Be Same or More Accessible
Access Levels (from least to most accessible):

private (least accessible)
default (package-private)
protected
public (most accessible)

class Parent {
    protected static void display() { System.out.println("Parent display"); }
}

class Child extends Parent {
    public static void display() { System.out.println("Child display"); }  // More accessible
}

3. Checked Exceptions: Child Cannot Throw New or Broader Exceptions

class Parent {
    public static void process() throws IOException {
        System.out.println("Parent process");
    }
}

class Child extends Parent {
    public static void process() throws FileNotFoundException {  // More specific exception
        System.out.println("Child process");
    }
}

4. Covariant Return Types

class Parent {
    public static Animal getAnimal() { return new Animal(); }
}

class Child extends Parent {
    public static Dog getAnimal() { return new Dog(); }  // Covariant return type
}

5. Static Methods in Child and Parent Classes

class Parent {
    public static void show() {
        System.out.println("Parent static show");
    }
}

class Child extends Parent {
    public static void show() {
        System.out.println("Child static show");  // Static method hiding
    }
}

public class Test {
    public static void main(String[] args) {
        Parent.show();  // Calls Parent's static method
        Child.show();   // Calls Child's static method
    }
}

Example (Method Overriding):

java
Copy code
class Parent {
    public void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    public void show() {
        System.out.println("Child show");  // Instance method overriding
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();  // Calls Child's instance method (method overriding)
    }
}