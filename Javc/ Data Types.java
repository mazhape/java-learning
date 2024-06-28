Task
Complete the code in the editor below. The variables , , and  are already declared and initialized for you. You must:

Declare  variables: one of type int, one of type double, and one of type String.
Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
Use the  operator to perform the following operations:
Print the sum of  plus your int variable on a new line.
Print the sum of  plus your double variable to a scale of one decimal place on a new line.
Concatenate  with the string you read as input and print the result on a new line.
Note: If you are using a language that doesnt support using  for string concatenation (e.g.: C), you can just print one variable immediately following the other on the same line. The string provided in your editor must be printed first, immediately followed by the string you read as input.

Input Format

The first line contains an integer that you must sum with .
The second line contains a double that you must sum with .
The third line contains a string that you must concatenate with .

Output Format

Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line, and then the two concatenated strings on the third line.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}

Explanation:
Variable Declarations:

We declare three new variables: secondInt (type int), secondDouble (type double), and secondString (type String).
Reading Input:

secondInt is assigned the next integer input.
secondDouble is assigned the next double input.
scan.nextLine() is used to consume the newline character left after reading the double value.
secondString is assigned the next line of input.
Performing Operations and Printing:

We print the sum of i and secondInt.
We print the sum of d and secondDouble, formatted to one decimal place using printf.
We concatenate and print the string s with secondString.
This code adheres to the input and output format described in the problem statement and correctly handles the specified operations.








import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
   /* Declare second integer, double, and String variables. */
        int secondInt;
        double secondDouble;
        String secondString;

        /* Read and save an integer, double, and String to your variables. */
        secondInt = scan.nextInt();
        secondDouble = scan.nextDouble();
        scan.nextLine();  // Consume the newline character left after nextDouble()
        secondString = scan.nextLine();
        
         /* Print the sum of both integer variables on a new line. */
         System.out.println(i +secondInt);
         
         /* Print the sum of the double variables on a new line. */
        System.out.printf("%.1f%n", d + secondDouble);

   /* Concatenate and print the String variables on a new line; 
           the 's' variable above should be printed first. */
        System.out.println(s + secondString);

        scan.close();
    }
}