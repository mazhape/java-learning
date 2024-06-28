You are given a  2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format

There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.

Output Format

Print the answer to this problem on a single line.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

The hourglass which has the largest sum is:

2 4 4
  2
1 2 4


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
    }
}


Explanation:
Reading the Input:

We read the 6x6 array from the standard input and store it in a 2D array arr.
Initializing the Maximum Sum:

We initialize maxHourglassSum to the smallest possible integer value (Integer.MIN_VALUE) to ensure any valid hourglass sum will be larger.
Iterating Over Possible Hourglasses:

We use two nested loops to iterate over the top-left corners of all possible hourglasses in the 6x6 array. The hourglass can only be formed if its top-left corner is within the first 4 rows and columns (i and j both range from 0 to 3).
Calculating Hourglass Sums:

For each position (i, j), we calculate the sum of the hourglass starting at that position using the predefined hourglass shape.
Updating the Maximum Sum:

We compare the current hourglass sum with maxHourglassSum and update maxHourglassSum if the current sum is greater.
Printing the Result:

Finally, we print the maximum hourglass sum found.
This approach ensures we efficiently calculate and track the maximum hourglass sum in the 6x6 array.









import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        // Add this code inside the main method after the existing code to compute and print the largest hourglass sum

int maxHourglassSum = Integer.MIN_VALUE;

for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
        int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                + arr.get(i+1).get(j+1)
                + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
        maxHourglassSum = Math.max(maxHourglassSum, sum);
    }
}

System.out.println(maxHourglassSum);
    }
}
