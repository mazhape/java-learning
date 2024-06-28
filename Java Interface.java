A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism. In this problem, you will practice your knowledge on interfaces.

You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.

divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.

Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.


import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}






an interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. They cannot contain constructors or instance variables. The interface itself does not contain any code for the methods, it only declares them (except for default and static methods). The methods must be implemented by any class that uses the interface.

Here are some key points about interfaces:

Method Signatures: An interface can declare method signatures, which must be implemented by any class that uses the interface. These methods are implicitly public and abstract.

}
Implementing Interfaces: A class implements an interface using the implements keyword. It must provide implementations for all methods declared in the interface.

}
Multiple Interfaces: A class can implement multiple interfaces, separated by commas.

}
Default Methods: From Java 8 onwards, interfaces can contain default methods. These are methods with a default implementation, which can be overridden by classes that implement the interface.

Static Methods: Interfaces can also contain static methods from Java 8 onwards. These are methods that belong to the interface itself, not to instances of the interface.

Functional Interfaces: An interface with exactly one abstract method is known as a functional interface. It can be used as the assignment target for a lambda expression or method reference.

Interfaces are a powerful tool in Java and other object-oriented languages. They allow you to define a contract that classes can choose to fulfill by implementing the interface. This promotes a form of polymorphism, where an object can be treated as an instance of its own class, or any of the interfaces it implements.


import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

// Write MyCalculator class here
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

