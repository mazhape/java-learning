Write the following code in your editor below:

A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic.
Your classes should not be be .

Input Format

You are not responsible for reading any input from stdin; a locked code stub will test your submission by calling the add method on an Adder object and passing it  integer parameters.

Output Format

You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.

Sample Output

The main method in the Solution class above should print the following:


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here

public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}

Arithmetic is a class with a method named add that takes two integers as parameters and returns their sum. Adder is a class that inherits from Arithmetic. In the main method, an Adder object is created, the name of its superclass is printed, and the add method is called three times with different parameters. The results are printed as space-separated integers.
Inheritance is one of the four fundamental principles of Object-Oriented Programming (OOP). It allows a class to inherit properties and behavior from another class. The class that is inherited from is called the superclass or parent class, and the class that inherits is called the subclass or child class.

In Java, inheritance is achieved using the extends keyword. For example, in your code, Adder is a subclass of Arithmetic:

}
This means that Adder inherits all the public and protected members (fields and methods) of Arithmetic. In this case, it inherits the add method:

}
So you can call add on an instance of Adder:

;
Inheritance promotes code reusability and is a way to model real-world relationships between objects. However, it should be used wisely. Overuse of inheritance can lead to tightly coupled code and can break encapsulation if subclasses depend too much on the implementation details of their superclasses.

In addition to single inheritance (one class extends one other class), Java also supports interface inheritance, also known as multiple inheritance of type. A class can implement multiple interfaces, and an interface can extend multiple interfaces.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;   

//Write your code here
class Arithmetic{
    int add(int a, int b){
        return a+b;
    }
}
class Adder extends Arithmetic{
}

public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}