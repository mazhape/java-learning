Example of a Trick Cast:
Consider the following classes and code snippet:

class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barking");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meowing");
    }
}

public class TestCast {
    public static void main(String[] args) {
        Animal animal = new Dog();  // This is valid upcasting.
        
        // Tricky cast!
        Cat cat = (Cat) animal;     // Compiler does not catch the error here!
        cat.meow();                 // Runtime error: ClassCastException
    }
}
Explanation of the Trick:
Upcasting (Animal animal = new Dog();) is valid because a Dog is a subclass of Animal.
The trick occurs with the cast Cat cat = (Cat) animal;. The compiler does not recognize the error here because at compile-time, it sees animal as an instance of Animal, and both Dog and Cat are subclasses of Animal. So, the cast is allowed at compile-time.
However, at runtime, this causes a ClassCastException, because the actual object in memory is a Dog, not a Cat, and you cannot cast a Dog to a Cat even though both extend Animal.
Key Points:
The compiler doesnt always catch incorrect casts between unrelated subclasses (like Dog and Cat) as long as they share a common parent class (like Animal).
The runtime environment checks the actual type of the object, and if the cast is invalid (like casting a Dog to a Cat), it throws a ClassCastException.
Exam Tip:
Look out for tricky casts between subclasses that seem plausible because of their shared superclass, but that will actually fail at runtime.

