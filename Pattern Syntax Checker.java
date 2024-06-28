Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

Input Format

The first line of input contains an integer , denoting the number of test cases. The next  lines contain a string of any printable characters representing the pattern of a regex.

Output Format

For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.

import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
		}
	}
}


Explanation:
Reading the number of test cases: We use Scanner to read the input. The first line contains the number of test cases.
Loop through each test case: For each test case, read the regex pattern string.
Check pattern validity: We attempt to compile the regex pattern using Pattern.compile.
If the pattern compiles successfully, we print "Valid".
If a PatternSyntaxException is thrown, we catch it and print "Invalid".
Decrement the test case counter: After processing each pattern, decrement the test case counter.
Close the scanner: Finally, close the scanner to avoid any resource leaks.
This approach ensures that each regex pattern is checked for its syntax correctness and the results are printed accordingly.










import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
    try {
        Pattern.compile(pattern);
        System.out.println("Valid");
    } catch (PatternSyntaxException exception) {
        System.out.println("Invalid");
    }
    testCases--;
}
		}
	}




