In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers,  and .

Constraints

 and  are non-negative integers and can have maximum  digits.

Output Format

Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}


 Scanner is used to read the input from the user. BigInteger is used to store the large numbers. The add and multiply methods of the BigInteger class are used to perform the addition and multiplication, respectively. The results are then printed to the console.

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         // Create a Scanner object to read input from stdin
        Scanner scanner = new Scanner(System.in);

        // Read the two numbers as BigInteger
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        // Close the scanner as we no longer need to read any more input
        scanner.close();

        // Add the two numbers
        BigInteger sum = a.add(b);

        // Multiply the two numbers
        BigInteger product = a.multiply(b);

        // Print the sum
        System.out.println(sum);

        // Print the product
        System.out.println(product);
    }
}