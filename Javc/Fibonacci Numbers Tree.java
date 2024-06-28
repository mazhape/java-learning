Shashank loves trees and math. He has a rooted tree, , consisting of  nodes uniquely labeled with integers in the inclusive range . The node labeled as  is the root node of tree , and each node in  is associated with some positive integer value (all values are initially ).

Lets define  as the  Fibonacci number. Shashank wants to perform  types of operations over his tree, :

  
Update the subtree rooted at node  such that the node at level  in subtree  (i.e., node ) will have  added to it, all the nodes at level  will have  added to them, and so on. More formally, all the nodes at a distance  from node  in the subtree of node  will have the  Fibonacci number added to them.
  
Find the sum of all values associated with the nodes on the unique path from  to . Print your sum modulo  on a new line.
Given the configuration for tree  and a list of  operations, perform all the operations efficiently.

Note: .

Input Format

The first line contains  space-separated integers,  (the number of nodes in tree ) and  (the number of operations to be processed), respectively.
Each line  of the  subsequent lines contains an integer, , denoting the parent of the  node.
Each of the  subsequent lines contains one of the two types of operations mentioned in the Problem Statement above.

Constraints

Output Format

For each operation of type  (i.e., ), print the required answer modulo  on a new line.


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}