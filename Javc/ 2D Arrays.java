Context
Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

Task
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

Example

In the array shown above, the maximum hourglass sum is  for the hourglass in the top left corner.

Input Format

There are  lines of input, where each line contains  space-separated integers that describe the 2D Array .

Constraints

Output Format

Print the maximum hourglass sum in .


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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}



Explanation:
Reading the input: We read the 6x6 2D array from the input using BufferedReader. Each line is split into integers and added to a list of lists.

Calculating the hourglass sums:

We initialize maxSum to Integer.MIN_VALUE to ensure any hourglass sum will be larger initially.
We iterate over all possible starting positions of hourglasses using two nested loops. The outer loop runs from 0 to 3 and the inner loop also runs from 0 to 3, ensuring we stay within the bounds of the array when accessing hourglass elements.
For each starting position (i, j), we calculate the sum of the hourglass that starts at that position.
Updating the maximum sum: For each hourglass sum calculated, we update maxSum if the current sum is greater than the previously recorded maximum sum.

Printing the result: Finally, we print the maximum hourglass sum.

This code correctly handles the constraints and efficiently calculates the maximum hourglass sum by iterating through all possible hourglasses in the 6x6 array.





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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        int maxHourglassSum = Integer.MIN_VALUE;

for (int i = 0; i <= 3; i++) {
    for (int j = 0; j <= 3; j++) {
        int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                + arr.get(i+1).get(j+1)
                + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
        maxHourglassSum = Math.max(maxHourglassSum, sum);
    }
}

System.out.println(maxHourglassSum);
    }
}
