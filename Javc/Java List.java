For this problem, we have  types of queries you can perform on a List:

Insert  at index :

Insert
x y
Delete the element at index :

Delete
x
Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,  (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,  (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
Constraints



Each element in is a 32-bit integer.
Output Format

Print the updated list  as a single line of space-separated integers.


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        
        // Read the initial number of elements in the list
        int n = sc.nextInt();
        
        // Read the initial elements of the list
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        // Read the number of queries
        int q = sc.nextInt();
        
        // Process each query
        for (int i = 0; i < q; i++) {
            String queryType = sc.next();
            
            if (queryType.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if (queryType.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        
        // Print the modified list as a single line of space-separated integers
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}


Explanation:
Reading Input:

We first read the number of initial elements in the list n.
We then read the n integers and store them in an ArrayList.
Processing Queries:

We read the number of queries q.
For each query, we read the type of query (Insert or Delete).
If the query is Insert, we read the index and the value to be inserted at that index and use list.add(index, value) to insert the value.
If the query is Delete, we read the index and use list.remove(index) to remove the element at that index.
Printing the List:

After processing all queries, we print the modified list as a single line of space-separated integers.
