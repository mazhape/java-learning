You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.

Input Format

The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.




Output Format

For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the persons name and phone number. See sample output for the exact format.

To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.

Sample Input

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
		}
	}
}


Explanation:
Reading Input:
We first read the number of entries n in the phone book.
We use a HashMap<String, Integer> called phoneBook to store the phone book entries where the key is the person's name and the value is their phone number.
Storing Entries:
For each entry, we read the person's name and their phone number, then store them in the HashMap.
Handling Queries:
We continue reading until the end of the input using while(in.hasNext()).
For each query, we check if the name exists in the HashMap.
If it exists, we print the name and phone number in the required format (name=phone).
If it does not exist, we print "Not found".




