Task
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation. When working with different bases, it is common to show the base as a subscript.

Example

The binary representation of  is . In base , there are  and  consecutive ones in two groups. Print the maximum, .

Input Format

A single integer, .

Constraints

Output Format

Print a single base- integer that denotes the maximum number of consecutive is in the binary representation of .



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
    }
}




Explanation:
Reading the input: The input is read using BufferedReader and parsed as an integer.
Conversion to binary: Integer.toBinaryString(n) converts the integer 
𝑛
n to its binary string representation.
Splitting the binary string: The binary string is split into parts where each part is a sequence of consecutive '1's. This is done using the split("0") method which splits the string at each '0'.
Finding the maximum length: We iterate through the resulting array of strings and keep track of the maximum length of any segment.
Output the result: Finally, we print the maximum length.
This solution efficiently converts the number to binary and then processes the binary string to find the desired result.




import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        // Continue from the existing code
int currentCount = 0, maxCount = 0;
String binaryString = Integer.toBinaryString(n);

for (char c : binaryString.toCharArray()) {
    if (c == '1') {
        currentCount++;
        maxCount = Math.max(maxCount, currentCount);
    } else {
        currentCount = 0;
    }
}

System.out.println(maxCount);
    }
}
