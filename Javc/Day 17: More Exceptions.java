Task
Write a Calculator class with a single method: int power(int,int). The power method takes two integers,  and , as parameters and returns the integer result of . If either  or  is negative, then the method must throw an exception with the message: n and p should be non-negative.

Note: Do not use an access modifier (e.g.: public) in the declaration for your Calculator class.

Input Format

Input from stdin is handled for you by the locked stub code in your editor. The first line contains an integer, , the number of test cases. Each of the  subsequent lines describes a test case in  space-separated integers that denote  and , respectively.

Constraints

No Test Case will result in overflow for correctly written code.
Output Format

Output to stdout is handled for you by the locked stub code in your editor. There are  lines of output, where each line contains the result of  as calculated by your Calculator class' power method.

Sample Input

4
3 5
2 4
-1 -2
-1 3
Sample Output

243
16
n and p should be non-negative
n and p should be non-negative
Explanation


:  and  are positive, so power returns the result of , which is .
:  and  are positive, so power returns the result of =, which is .
: Both inputs ( and ) are negative, so power throws an exception and  is printed.
: One of the inputs () is negative, so power throws an exception and  is printed.




import java.util.*;
import java.io.*;

//Write your code here

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

Explanation
Calculator Class:

The Calculator class has a single method power(int n, int p).
If either n or p is negative, it throws an Exception with the message "n and p should be non-negative".
Otherwise, it returns n raised to the power of p using Math.pow(n, p).
Solution Class:

Reads input from stdin.
For each test case, it reads n and p.
It creates an instance of Calculator and calls the power method.
It prints the result if no exception is thrown, otherwise, it prints the exception message.



import java.util.*;
import java.io.*;

//Write your code here
class Calculator {
    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int)Math.pow(n, p);
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
