Task
Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note:  is considered to be an even index.

Example


Print abc def

Input Format

The first line contains an integer,  (the number of test cases).
Each line  of the  subsequent lines contain a string, .

Constraints

Output Format

For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    }
}




Scanner Initialization: Scanner sc = new Scanner(System.in); This line initializes a Scanner object that reads from the standard input.

Reading Test Cases: int T = sc.nextInt(); This line reads an integer T, which represents the number of test cases.

Consuming the Newline: sc.nextLine(); This line consumes the newline character left in the input stream after reading T.

Processing Each Test Case: The for loop for (int i = 0; i < T; i++) iterates over each test case.

Reading the String: String str = sc.nextLine(); This line reads the string for the current test case.

Initializing StringBuilders: StringBuilder evenIndexed = new StringBuilder(); and StringBuilder oddIndexed = new StringBuilder(); These lines initialize two StringBuilder objects to store the even-indexed and odd-indexed characters, respectively.

Processing Each Character: The nested for loop for (int j = 0; j < str.length(); j++) iterates over each character in the string.

Appending Characters: The if statement if (j % 2 == 0) checks if the current index is even. If it is, the character at that index is appended to evenIndexed. Otherwise, it is appended to oddIndexed.

Printing the Result: System.out.println(evenIndexed + " " + oddIndexed); This line prints the even-indexed and odd-indexed characters as space-separated strings on a single line.

Closing the Scanner: sc.close(); This line closes the Scanner object to prevent resource leaks.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
          sc.nextLine(); // consume the newline
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            StringBuilder evenIndexed = new StringBuilder();
            StringBuilder oddIndexed = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 0) {
                    evenIndexed.append(str.charAt(j));
                } else {
                    oddIndexed.append(str.charAt(j));
                }
            }
            System.out.println(evenIndexed + " " + oddIndexed);
        }
        sc.close();
}
}




