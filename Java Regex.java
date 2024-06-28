Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:

IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
Some valid IP address:

000.12.12.034
121.234.12.12
23.45.12.56
Some invalid IP address:

000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.
I.Am.not.an.ip
In this problem you will be provided strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.

Just write the MyRegex class which contains a String . The string should contain the correct regular expression.

(MyRegex class MUST NOT be public)


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here


Explanation:
Pattern for each octet:
25[0-5] matches numbers from 250 to 255.
2[0-4][0-9] matches numbers from 200 to 249.
[01]?[0-9][0-9]? matches numbers from 0 to 199. This is broken down further into:
[01]? optionally matches a leading 0 or 1.
[0-9] matches any digit.
[0-9]? optionally matches another digit.
Combining the octets:
((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3} matches the first three octets followed by a dot.
(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?) matches the fourth octet without a trailing dot.
The complete regular expression ensures that the IP address is valid according to the specified rules.


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    // Regular expression pattern to match valid IP addresses
    String pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.)" +
                     "{3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
}
