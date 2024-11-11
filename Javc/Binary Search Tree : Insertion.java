You are given a pointer to the root of a binary search tree and values to be inserted into the tree. Insert the values into their appropriate position in the binary search tree and return the root of the updated binary tree. You just have to complete the function.

Input Format

You are given a function,

Node * insert (Node * root ,int data) {

}
Constraints

No. of nodes in the tree  500
Output Format

Return the root of the binary search tree after inserting the value into the tree.

Sample Input

        4
       / \
      2   7
     / \
    1   3
The value to be inserted is 6.

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
   
  	public static void preOrder( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {

    	
    }

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
      	preOrder(root);
    }	
}


To complete the insert function for inserting a value into a binary search tree, follow these steps:

Base Case: If the root is null, create a new node with the given data and return it as the new root.
Recursive Insertion:
If the data to be inserted is less than the roots data, recursively insert the data in the left subtree.
If the data to be inserted is greater than the roots data, recursively insert the data in the right subtree.
Return the Root: After insertion, return the root of the tree to ensure the links are maintained correctly.




import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
   
  	public static void preOrder( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
if (root == null) {
        return new Node(data);
    } else if (data < root.data) {
        root.left = insert(root.left, data);
    } else {
        root.right = insert(root.right, data);
    }
    return root;
    	
    }

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
      	preOrder(root);
    }	
}