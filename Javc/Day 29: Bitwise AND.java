Objective
Welcome to the last day! Today, we are discussing bitwise operations. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given set . Find two integers,  and  (where ), from set  such that the value of  is the maximum possible and also less than a given integer, . In this case,  represents the bitwise AND operator.

Function Description
Complete the bitwiseAnd function in the editor below.

bitwiseAnd has the following paramter(s):
- int N: the maximum integer to consider
- int K: the limit of the result, inclusive

Returns
- int: the maximum value of  within the limit.

Input Format

The first line contains an integer, , the number of test cases.
Each of the  subsequent lines defines a test case as  space-separated integers,  and , respectively.

Constraints

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

class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Result.bitwiseAnd(count, lim);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}


To complete the bitwiseAnd function, you need to find the maximum possible value of (A & B) (where (A < B \leq N)) that is also less than (K). A straightforward approach is to check all combinations of (A) and (B), but this is inefficient for large (N). A more efficient approach takes advantage of the properties of the bitwise AND operation.

Heres a step-by-step plan to implement the bitwiseAnd function:

Understand that the result of (A & B) will always be less than both (A) and (B), so you only need to consider (A) and (B) where (A < B).
Realize that if (K-1) and (K-2) can be candidates for (A) and (B), their AND will be the maximum and closest to (K), because
the most significant bits of (K-1) and (K-2) will match those of (K) up to the point where their binary representations diverge.
Check if ((K-1) & (K-2) < K); if so, return (K-1 & K-2). However, this condition is always true by the problem's constraints, so the real challenge is to ensure (A) and (B) are within the set defined by (N).
Iterate backwards from (N) (or (K-1) if (K-1 \leq N)) to find the highest (A) and (B) that satisfy the conditions.
Here's the optimized code for the bitwiseAnd function:

However, this approach can still be optimized further by considering the binary representation of (K) and (N). For the scope of this problem and given the constraints, the provided solution offers a balance between simplicity and efficiency, ensuring that the function works correctly within reasonable bounds of (N) and (K).

Here


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

class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
    // Write your code here
int maxAB = 0;
    for (int B = N; B > 0; B--) {
        for (int A = B - 1; A > 0; A--) {
            int currentAB = A & B;
            if (currentAB < K && currentAB > maxAB) {
                maxAB = currentAB;
            }
        }
    }
    return maxAB;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Result.bitwiseAnd(count, lim);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
