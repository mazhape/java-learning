Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: n x i = result.

Example

The printout should look like this:

3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
Input Format

A single integer, .

Constraints

Output Format

Print  lines of output; each line  (where ) contains the  of  in the form:
n x i = result.


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


`BufferedReader` is a Java class used to read the text from a character-based input stream. It buffers characters so as to provide efficient reading of characters, arrays, and lines. 

In the context of your code:

BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


Here's what's happening:

1. `System.in` is an `InputStream` which is typically connected to keyboard input of console programs.
2. `InputStreamReader` is a bridge from byte streams to character streams. It reads bytes and decodes them into characters using a specified charset.
3. `BufferedReader` takes `InputStreamReader` as an argument to buffer the input, making the reading of characters, arrays, and lines more efficient.

Then, when you call `bufferedReader.readLine().trim()`, it reads a line of text. A line is considered to be terminated by any one of a line feed ('\n'), a carriage return ('\r'), or a carriage return followed immediately by a linefeed. The `trim()` method is used to eliminate leading and trailing spaces.

The `Integer.parseInt` method is then used to convert the read string into an integer.

The for loop starts with i = 1 and ends with i = 10. For each iteration, it prints a line in the format n x i = result, where result is the product of n and i.

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
       for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

  
        bufferedReader.close();
    }
}
