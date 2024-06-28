Objective
Today, we are learning about Interfaces. Check out the Tutorial tab for learning materials and an instructional video!

Task
The AdvancedArithmetic interface and the method declaration for the abstract divisorSum(n) method are provided for you in the editor below.

Complete the implementation of Calculator class, which implements the AdvancedArithmetic interface. The implementation for the divisorSum(n) method must return the sum of all divisors of .

Example

The divisors of  are . Their sum is .


The divisors of  are  and their sum is .

Input Format

A single line with an integer, .

Constraints

Output Format

You are not responsible for printing anything to stdout. The locked template code in the editor below will call your code and print the necessary output.

Sample Input

6
Sample Output

I implemented: AdvancedArithmetic
12
Explanation

The integer  is evenly divisible by , , , and . Our divisorSum method should return the sum of these numbers, which is . The Solution class then prints  on the first line, followed by the sum returned by divisorSum (which is ) on the second line.



import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        return 0;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}

Explanation:
Interface AdvancedArithmetic:

Defines the method divisorSum(int n) which needs to be implemented.
Class Calculator:

Implements the AdvancedArithmetic interface.
The divisorSum(int n) method iterates from 1 to n and checks if i is a divisor of n using n % i == 0. If true, i is added to sum.
Class Solution:

Reads an integer n from input.
Creates an instance of Calculator.
Calls the divisorSum method and prints the implemented interface name and the result.
The implementation ensures that the sum of all divisors of the input number is correctly calculated and returned. This solution adheres to the constraints and correctly implements the required functionality.


import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}