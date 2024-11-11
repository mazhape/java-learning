OCA Java 8 Exam Practice Questions Variable Scope Questions Question 1 javaCopypublic

class ScopeTest {
    private int x = 0;
    private static int y = 0;

    public void method1() {
        int x = 1;
        System.out.println(x + " " + this.x + " " + y);
    }

    public static void method2() {
        int y = 2;
        System.out.println(y + " " + ScopeTest.y);
    }}

    What is
    the output
    when both
    methods are called?Answer:

method1() prints: 1 0 0
method2() prints: 2 0

Explanation:

Local variable x shadows instance variable
this.x refers to instance variable
Static variable y is accessible from both methods
Local y in method2 shadows static y

Question 2
javaCopypublic

    void testScope() {
    int x;
    if (true) {
        x = 1;
        int y = 2;
    }
    System.out.println(x);
    System.out.println(y); // Does this compile?
}Answer:

    Compilation error
    at System.out.println(y)Explanation:

x is
    in scope for
    entire method
y is
    only in
    scope within if
    block Variables
    declared in
    blocks are
    not accessible
    outside

Method
    Overriding vs
    Overloading Question 3
javaCopyclass Animal{

    protected void makeSound() {
        System.out.println("Animal");
    }

    public void eat(String food) {
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog");
    }

    public void eat(String food, int quantity) {
    }

    private void eat(String food) {
    } // Does this compile?
    }Answer:

    Compilation error Explanation:

Cannot reduce
    visibility in

    overridden method (makeSound() is fine)
eat(String, int) is an

    overloaded method (OK)
eat(String) attempts to override with

    reduced visibility (error)

String vs StringBuilder
Question 4
javaCopyString str = "Hello";
StringBuilder sb = new StringBuilder("Hello");
str.concat(" World");
sb.append(" World");
System.out.println(str);
System.out.println(sb);
Answer:
CopyHello
Hello World
Explanation:

String is immutable, concat() returns new String
StringBuilder is mutable, append() modifies object
Original str remains unchanged
sb is modified by append()

Access Modifiers
Question 5
javaCopypackage com.test;
public class Parent {
    protected void method1() { }
    void method2() { }
}

package com.test.sub;

import com.test.Parent;

class Child extends Parent {
    public void testAccess() {
        method1(); // Line 1
        method2(); // Line 2
        Parent p = new Parent();
        p.method1(); // Line 3
    }}Answer:Line 2

    and Line 3
    cause compilation
    errors Explanation:

protected members are
    accessible in

    subclasses (Line 1 OK)
default (package-private) not accessible in different package (Line 2 error)

    protected members not
    accessible through
    reference in different package(Line 3 error)

Arrays vs
    ArrayList Question 6
    javaCopyList<String> list = new ArrayList<>();list.add("A");list.add("B");list.add(1,"C");
    String[] array = list.toArray(
            new String[0]);list.remove(1);System.out.println(Arrays.toString(array));System.out.println(list);Answer:Copy[A,C,B][A,B]Explanation:

Array is
    independent copy
    of list
    contents
Removing
    from list
    doesnt affect
    array
ArrayList
    can dynamically

    resize
toArray() creates new array with list contents

Static vs Instance Members
Question 7
javaCopypublic class Test {
    static int count = 0;
    int instanceCount = 0;
    
    public Test() {
        count++;
        instanceCount++;
    }
    
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1.count + " " + t1.instanceCount);
        System.out.println(t2.count + " " + t2.instanceCount);
    }
}
Answer:
Copy2 1
2 1
Explanation:

Static count shared among all instances
Each instance has its own instanceCount
Both objects see same count value
Each object has separate instanceCount

Common Traps
Question 8 (String Immutability)
javaCopyString s1 = new String("Hello");
String s2 = "Hello";
String s3 = s1.intern();
System.out.println(s1 == s2);
System.out.println(s2 == s3);
Answer:
Copyfalse
true
Explanation:

new String creates new object in heap
String literal uses string pool
intern() returns string pool reference
== compares references, not content

Question 9 (Reference vs Object)
javaCopyArrayList<StringBuilder> list = new ArrayList<>();
list.add(new StringBuilder("A"));
list.add(new StringBuilder("B"));
list.add(list.get(1));
list.get(2).append("C");
System.out.println(list.get(1));
Answer: BC
Explanation:

list.get(1) and list.get(2) reference same object
Modifying one affects both
StringBuilder objects are mutable
References point to same object

Question 10 (Exception Handling)
javaCopytry {
    throw new IOException();
} catch (Exception e) {
    throw new SQLException();
} finally {
    throw new RuntimeException();
}
Answer: RuntimeException is thrown
Explanation:

finally block always executes
finally block exception replaces catch block exception
Original exception is lost
Only one exception can be propagated

Question 11 (Implicit Casting)
javaCopybyte b = 100;
int i = b;      // Line 1
long l = i;     // Line 2
float f = l;    // Line 3
double d = f;   // Line 4
b = i;          // Line 5
Answer: Line 5 causes compilation error
Explanation:

Widening conversions

    are implicit (Lines 1-4)
Narrowing conversions require explicit cast
byte <- int requires cast
Possible data loss in narrowing

Question 12 (Loop Behavior)
javaCopyouter: for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 3; j++) {
        if(i == 1 && j == 1) {
            continue outer;
        }
        System.out.print(i + "" + j + " ");
    }
}
Answer: 00 01 02 10 20 21 22
Explanation:

Labeled continue skips to next iteration of outer loop
When i=1 and j=1, skips rest of inner loop
Inner loop restarts with i=2
Break would exit the loop entirely

Key Study Tips:

Practice identifying scope boundaries
Understand difference between reference and object
Remember String immutability rules
Know access modifier restrictions
Understand

    static vs instance
context Practice
tracing loop
    control flow

Advanced Practice
    Questions and
    Scenarios
Section 1:
    Complex Access
    Scenarios Question 1:Multi-Level Access javaCopy// package com.example.a

    public class Vehicle {
        String type = "Generic";

        public void start() {
            System.out.println("Starting " + type);
        }
    }

    // package com.example.b
    public class Car extends Vehicle {
        public void displayInfo() {
            System.out.println(type); // Line 1
            start(); // Line 2
        }
    }

    // package com.example.c
    class TestVehicle {
        public static void main(String[] args) {
            Car car = new Car();
            car.type = "Sedan"; // Line 3
            car.displayInfo(); // Line 4
        }
    }

What happens?A)
    Compiles and
    runs
B)
   Error at Line 1 C)
    Error at Line 2 D)
    Error at Line 3 Answer:D)
    Error at Line 3 Explanation:

    Line 1
    works because inherited default
    members are
    accessible in
    subclass Line 2
    works because
    public methods are
    accessible everywhere Line 3
    fails because
    type has default
    access and
    TestVehicle is
    in different package Line 4
    works because

    displayInfo() is public

Question 2: Constructor Chain
javaCopy// package p1
public class Parent {
    Parent() {
        System.out.println("Parent");
    }
}

// package p2
class Child extends Parent {
    public Child() {
        super();
        System.out.println("Child");
    }
}
What happens when trying to create a Child object from another package?
A) Compiles and runs successfully
B) Compilation error in Child class
C) Compilation error when creating Child object
D) Runtime error
Answer: C) Compilation error when creating Child object
Explanation:

Child class has default access
Cannot be accessed from another package
Even though Parent is public, Child isn't
Constructor chain works but class isn't accessible

Section 2: Interface and Abstract Class Scenarios
Question 3: Interface Implementation
javaCopy// package com.test
public interface Printable {
    void print();
}

// package com.impl
class Document implements Printable {  // Line 1
    void print() {                    // Line 2
        System.out.println("Printing");
    }
}
What's wrong with this code?
A) Line 1 is invalid
B) Line 2 is invalid
C) Both lines are invalid
D) Code is valid
Answer: B) Line 2 is invalid
Explanation:

Interface is public, so it can be implemented from any package
Interface methods are implicitly public
Implementation cannot reduce visibility
print() must be declared public in Document class

Section 3: Complex Inheritance Scenarios
Question 4: Multiple Class Relationships
javaCopy// File: com/example/base/Base.java
package com.example.base;
public class Base {
    String baseField = "Base";
    public String publicField = "Public";
}

// File: com/example/middle/Middle.java
package com.example.middle;
import com.example.base.Base;

class Middle extends Base {
    void accessFields() {
        System.out.println(baseField); // Line 1
        System.out.println(publicField); // Line 2
    }
}

// File: com/example/sub/Sub.java
package com.example.sub;
import com.example.middle.Middle;

public class Sub extends Middle { // Line 3
    void testAccess() {
        System.out.println(publicField); // Line 4
    }}

    Which lines
    cause compilation errors?A)Line 1
    only
B)Line 3
    only C)Line 4
    only D)Lines 1 and 3 Answer:B)Line 3
    only Explanation:

    Line 1:OK-
    inherited field
    accessible in
    subclass Line 2:OK-
    public field accessible
    everywhere Line 3:Error-
    cannot extend

    Middle (default access) from different package
Line 4: Would be OK if Line 3 compiled

Section 4: Common Exam Scenarios
Scenario 1: Package Organization
javaCopy// package org.example.model
public class User {
    String username;                   // default access
    public String getUsername() {      // public access
        return username;
    }
}

// package org.example.service
class UserService {
    public void processUser(User user) {
        String name = user.username;   // Line 1
        name = user.getUsername();     // Line 2
    }
}

// package org.example.web
class UserController {
    private UserService service;       // Line 3
    public void handleRequest(User user) {
        service.processUser(user);     // Line 4
    }
}
What issues exist in this code?
A) Line 1 only
B) Line 3 only
C) Lines 1 and 3
D) No issues
Answer: A) Line 1 only
Explanation:

Line 1: Error - cannot access default field from different package
Line 2: OK -

    public method accessible Line 3:OK-
    classes in same package Line 4:OK-
    public method call

    Scenario 2:
    Nested Classes javaCopy// package p1

    public class Outer {
        class Inner { // default access
            public void innerMethod() {
            }
        }

        public Inner getInner() {
            return new Inner();
        }
    }

    // package p2
    class Test {
        void testMethod() {
            Outer outer = new Outer();
            Outer.Inner inner = outer.new Inner(); // Line 1
            Outer.Inner inner2 = outer.getInner(); // Line 2
        }
    }What's

    the result?A)
    Compiles successfully B)
    Error at Line 1 C)
    Error at Line 2 D)
    Error at
    both lines Answer:B)
    Error at Line 1 Explanation:

    Inner

    class has default
    access Cannot
    be directly
    accessed from different package Can
    be returned via
    public method Demonstrates
    encapsulation principle

    Additional Important Concepts 1.
    Member Access
    Rules javaCopypackage p1;

    public class A {
            String s1 = "default";
            public String s2 = "public";
        }

        package p2;

        class B extends A {
            void method() {
                A a = new A();
                System.out.println(s1); // OK - inherited
                System.out.println(a.s1); // Error - not accessible
                System.out.println(a.s2); // OK - public
            }
        }2.

        Package Structure
        Impact javaCopy// com/example/internal/Helper.java
        package com.example.internal;

        class Helper { // default access
            static void helperMethod() {
            }
        }

        // com/example/api/API.java
        package com.example.api;

        public class API {
            public void method() {
                // Helper.helperMethod(); // Won't compile
            }
        }

        This demonstrates
        proper encapsulation:

        Helper

        class not
        accessible outside its package API

        class provides
        public interface Implementation
        details hidden

        3.
        Interface Implementation
        Nuances javaCopypackage p1;

        public interface Drawable {
                        void draw(); // implicitly public
                    }

                    package p2;

                    class Shape implements Drawable { // OK
                        void draw() {
                        } // Error - must be public
                    }Remember:

                    Interface methods
                    are always
                    public Implementation cannot
                    reduce visibility
                    Default access won'twork for

                    interface methods

                    Object Class
                    in Java
                    Basic Concept

                    Every

                    class in
                    Java implicitly extends java.lang.Object if
                    no other
                    superclass is
                    specified Object

                    class is
                    at the
                    root of Java's

                    class hierarchy
                    Contains methods
                    that all
                    Java objects
                    inherit

                    Key
                    Methods from
                    Object Class 1.

   toString()
javaCopypublic class Student {
    private String name;
    private int id;
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // Default toString() inherited from Object returns: getClass().getName() + '@' + Integer.toHexString(hashCode())
    // Override to provide meaningful string representation
    @Override
    public String toString() {
        return "Student[name=" + name + ", id=" + id + "]";
    }
}
2. equals()
javaCopypublic class Point {
    private int x, y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Default equals() inherited from Object uses == (reference equality)
    // Override to provide meaningful object equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return x == other.x && y == other.y;
    }
}
3. hashCode()
javaCopypublic class Employee {
    private String name;
    private int id;
    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // If you override equals(), you must override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return id == other.id && Objects.equals(name, other.name);
    }
}
Common Exam Questions
Question 1: Class Declaration
javaCopyclass Test {

                                    public static void main(String[] args) {
                                        System.out.println(Test.class.getSuperclass().getName());
                                    }
                                }

                                What is
                                the output?Answer:
                                java.lang.Object Explanation:

                                Every

                                class implicitly extends Object
getSuperclass() returns the superclass
Object is the root of class hierarchy

Question 2: Method Inheritance
javaCopyclass Animal {
}

class Dog extends Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.toString());
        System.out.println(dog.hashCode());
        System.out.println(dog.equals(dog));
    }
}
Will this code compile and run?
Answer: Yes
Explanation:

All methods from Object are inherited
toString(), hashCode(), equals() are available
Default implementations are used

Question 3: equals() and hashCode()
javaCopyclass Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return name.equals(((Person)obj).name);
        }
        return false;
    }
}
Whats wrong with this code?
Answer: hashCode() should be overridden when equals() is overridden
Explanation:

equals()

         and hashCode() should be overridden together
HashSet and HashMap depend on this contract
Objects equal

              by equals() must have

                                    same hashCode()

Important Methods List

toString()

Returns string representation
Default: className@hashCode


equals(Object obj)

Tests object equality
Default:

         reference equality (==)


hashCode()

Returns hash code value
Used in hash-based collections


getClass()

Returns runtime class
Cannot be overridden (final)


clone()

Creates object copy
Protected method
Requires Cloneable interface


finalize()

Called by garbage collector
Deprecated since Java 9


wait(), notify(), notifyAll()

Thread synchronization
Require synchronized context



Best Practices
1. Always Override toString()
javaCopypublic class Car {
    private String brand;
    private String model;
    
    @Override
    public String toString() {
        return String.format("Car[brand=%s, model=%s]", brand, model);
    }
}
2. equals() and hashCode() Contract
javaCopypublic class Book {
    private String isbn;
    private String title;
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(isbn, book.isbn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
3. Protected clone() Usage
javaCopypublic class Rectangle implements Cloneable {
    private int width;
    private int height;
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
Common Gotchas

equals() Parameter Type

javaCopyclass Wrong {
    // Wrong - not overriding equals(Object)
    public boolean equals(Wrong obj) {
        return true;
    }
}

class Right {
    // Correct - overrides equals(Object)
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

hashCode() Contract

javaCopyclass Broken {
    private int id;
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Broken) {
            return id == ((Broken)obj).id;
        }
        return false;
    }
    // Missing hashCode() - violates contract!
}

toString() Usage

javaCopyclass Customer {

                                    private String name;
                                    // toString() not overridden
                                    // Will print something like "Customer@15db9742"
}

Example of Abstraction in Action
Heres a simple example combining both abstract classes and interfaces:

java
Copy code
abstract class Shape {
    abstract void draw();
}

interface Colorable {
    void color(String color);
}

class Rectangle extends Shape implements Colorable {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    public void color(String color) {
        System.out.println("Coloring the rectangle with " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.color("red");
    }
}
In this example, Shape is an abstract class with an abstract method draw(), while Colorable is an interface with the color() method. The Rectangle class extends Shape and implements Colorable, demonstrating abstraction effectively.



