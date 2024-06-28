Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.

Lets say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

You are given code in the editor. Complete the code so that it prints the following lines:

1
2
3
Hello
World
Do not use method overloading because your answer will not be accepted.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

In this code:

The printArray method accepts an array of type Object, which allows it to handle both integer and string arrays.
Inside the method, a for-each loop is used to iterate over the elements of the array and print each element.
In the main method, example arrays of type Object containing integer and string elements are created and passed to the printArray method, which prints the elements as required.

import java.io.*;
import java.util.*;

public class Solution {

    // Generic method to print array elements
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3};
        // String array
        String[] stringArray = {"Hello", "World"};

        // Print integer array
        printArray(intArray);
        // Print string array
        printArray(stringArray);
    }
}