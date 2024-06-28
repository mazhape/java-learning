Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".


import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

Explanation:
Conversion to Lowercase:

a = a.toLowerCase();
b = b.toLowerCase();
This ensures that the comparison is case-insensitive.
Length Check:

if (a.length() != b.length()) { return false; }
If the strings have different lengths, they cannot be anagrams.
Character Frequency Count:

int[] charCountA = new int[26];
int[] charCountB = new int[26];
Arrays charCountA and charCountB keep track of the frequency of each character in a and b, respectively.
Counting Frequencies:

For each character in the strings, increment the corresponding index in the frequency arrays:
java
Copy code
for (int i = 0; i < a.length(); i++) {
    charCountA[a.charAt(i) - 'a']++;
    charCountB[b.charAt(i) - 'a']++;
}
Comparison of Frequency Arrays:

return Arrays.equals(charCountA, charCountB);
This checks if both frequency arrays are identical.

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        // Convert both strings to lowercase and to char array
char[] aChars = a.toLowerCase().toCharArray();
char[] bChars = b.toLowerCase().toCharArray();

// Sort the char arrays
java.util.Arrays.sort(aChars);
java.util.Arrays.sort(bChars);

// Check if sorted char arrays are equal
return java.util.Arrays.equals(aChars, bChars);
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
