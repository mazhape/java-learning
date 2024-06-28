
Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or exceptional conditions requiring special processing – often changing the normal flow of program execution. (Wikipedia)

Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception will occur and


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


    }
}

Explanation:
Reading Inputs:

Scanner scanner = new Scanner(System.in); creates a Scanner object to read from standard input.
int x = scanner.nextInt(); and int y = scanner.nextInt(); read two integers from the input.
Try Block:

Attempts to perform the division int result = x / y;.
If successful, it prints the result.
Catch Blocks:

catch (InputMismatchException e) catches cases where the inputs are not valid integers and prints java.util.InputMismatchException.
catch (ArithmeticException e) catches cases where division by zero occurs and prints java.lang.ArithmeticException: / by zero.
catch (Exception e) is a general catch for any other exceptions that might occur, printing the exception message.
Finally Block:

Ensures the scanner is closed to free up resources.




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner scanner = new Scanner(System.in);
        
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            // Perform the division
            int result = x / y;
            System.out.println(result);
        } catch (InputMismatchException e) {
            // This exception occurs if the input is not a valid integer
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            // This exception occurs if there is an attempt to divide by zero
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (Exception e) {
            // General catch-all for any other exceptions
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
    
}
