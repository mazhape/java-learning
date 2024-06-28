MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function with a -bit hash value. Here are some common uses for MD5:

To store a one-way hash of a password.
To provide some assurance that a transferred file has arrived intact.
MD5 is one in a series of message digest algorithms designed by Professor Ronald Rivest of MIT (Rivest, ); however, the security of MD5 has been severely compromised, most infamously by the Flame malware in . The CMU Software Engineering Institute essentially considers MD5 to be "cryptographically broken and unsuitable for further use".

Given an alphanumeric string, , denoting a password, compute and print its MD5 encryption value.

Input Format

A single alphanumeric string denoting .

Constraints

String  consists of English alphabetic letters (i.e.,  and/or decimal digits (i.e.,  through ) only.
Output Format

Print the MD5 encryption value of  on a new line.

Sample Input 0

HelloWorld
Sample Output 0

68e109f0f40ca72a15e05cc22786f8e6
Sample Input 1

Javarmi123
Sample Output 1

2da2d1e0ce7b4951a858ed2d5


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

Explanation:
Reading Input:

Use BufferedReader to read the input string from standard input.
MD5 Hash Computation:

Use MessageDigest.getInstance("MD5") to get an instance of the MD5 digest.
Convert the input string to a byte array using input.getBytes().
Compute the MD5 hash using md.digest().
Convert Byte Array to Hexadecimal:

Use BigInteger to convert the byte array to a hexadecimal string representation.
Use no.toString(16) to convert the BigInteger to a hexadecimal string.
Ensure the resulting string is 32 characters long by prepending zeros if necessary.
Print the Result:

Print the hexadecimal string which is the MD5 hash of the input.
This code will correctly compute and print the MD5 hash for the given input string.

import java.io.*;
import java.util.*;
import java.security.*;
import java.math.BigInteger; // Import BigInteger class

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            // Read the input string
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine().trim();
            
            // Get the instance of MD5 digest
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Compute the hash
            byte[] messageDigest = md.digest(input.getBytes());
            
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
            
            // Convert the message digest into hex value
            String hashtext = no.toString(16);
            
            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            
            // Print the MD5 hash
            System.out.println(hashtext);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}