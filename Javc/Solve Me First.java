Complete the function solveMeFirst to compute the sum of two integers.

Example


Return .

Function Description

Complete the solveMeFirst function in the editor below.

solveMeFirst has the following parameters:

int a: the first value
int b: the second value
Returns
- int: the sum of  and 

Constraints


Sample Input

a = 2
b = 3
Sample Output

5
Explanation

.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {



    static int solveMeFirst(int a, int b) {
      // Hint: Type return a+b; below
      
	}

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
	}
}


Explanation:
Function Definition:

static int solveMeFirst(int a, int b) is defined to take two integers a and b and return their sum.
Return Statement:

return a + b; computes the sum of a and b and returns the result.
Main Method:

The main method reads two integers using Scanner.
It calls solveMeFirst(a, b) to compute the sum.
It prints the computed sum.
This solution is straightforward and satisfies the requirement of summing two integers and printing the result.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {



    static int solveMeFirst(int a, int b) {
      // Hint: Type return a+b; below
       return a + b;
	}

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
	}
}