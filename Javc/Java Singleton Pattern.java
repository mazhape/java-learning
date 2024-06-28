Complete the Singleton class in your editor which contains the following components:

A private Singleton non parameterized constructor.
A public String instance variable named .
Write a static method named getSingleInstance that returns the single instance of the Singleton class.
Once submitted, our hidden Solution class will check your code by taking a String as input and then using your Singleton class to print a line.

Input Format

You will not be handling any input in this challenge.

Output Format

You will not be producing any output in this challenge.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{

}


Explanation:
Private Constructor: The constructor Singleton() is private, ensuring that no other class can instantiate this class directly.

Public Instance Variable: A public String instance variable named str is declared.

Static Method getSingleInstance:

This method checks if the single instance singleInstance is null.
If singleInstance is null, it creates a new Singleton object.
It then returns the singleInstance.
This implementation ensures that only one instance of the Singleton class can be created, following the singleton pattern.

The hidden Solution class will be able to use this class as required.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton {
    private static Singleton instance;
    public String str;

    private Singleton() {}

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}