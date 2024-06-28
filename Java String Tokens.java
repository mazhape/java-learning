Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format

A single string, .

Constraints

 is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
Output Format

On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .

Sample Input

He is a very very good boy, is not he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
Explanation

We consider a token to be a contiguous segment of alphabetic characters. There are a total of  such tokens in string , and each token is printed in the same order in which it appears in string .



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
    }
}

Explanation:
Reading the Input:

Scanner scan = new Scanner(System.in);
String s = scan.nextLine();
This reads the entire input line as a string.
Splitting the String:

String[] tokens = s.split("[^A-Za-z]+");
This splits the string at any sequence of non-alphabetic characters.
Filtering Empty Tokens:

An empty token might be generated if the string starts or ends with non-alphabetic characters.
We use a list to filter out these empty tokens.
Printing Results:

First, the number of valid tokens is printed.
Then, each token is printed on a new line.



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
String s = scan.nextLine().trim(); // Trim to remove leading and trailing spaces

// Check if the string is empty after trimming
if (s.length() == 0) {
    System.out.println(0);
} else {
    // Use regex to split the string on any non-alphabetic character
    String[] tokens = s.split("[^A-Za-z]+");

    // Print the number of tokens
    System.out.println(tokens.length);

    // Print each token
    for (String token : tokens) {
        System.out.println(token);
    }
}

scan.close();
    }
}

