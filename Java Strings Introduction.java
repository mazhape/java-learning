String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length() + B.length());
        
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
        
        sc.close();
    }
    
    private static String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}


This code reads strings A and B from the input, calculates and prints the sum of their lengths, checks if A is lexicographically larger than B and prints "Yes" or "No" accordingly, and prints A and B with their first letters capitalized. The compareTo method is used for lexicographic comparison, and a helper method capitalizeFirstLetter is used to capitalize the first letter of a string.This code reads strings A and B from the input, calculates and prints the sum of their lengths, checks if A is lexicographically larger than B and prints "Yes" or "No" accordingly, and prints A and B with their first letters capitalized. The compareTo method is used for lexicographic comparison, and a helper method capitalizeFirstLetter is used to capitalize the first letter of a string.


