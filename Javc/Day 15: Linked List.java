A Node class is provided for you in the editor. A Node object has an integer data field, , and a Node instance pointer, , pointing to another node (i.e.: the next node in the list).

A Node insert function is also declared in your editor. It has two parameters: a pointer, , pointing to the first node of a linked list, and an integer, , that must be added to the end of the list as a new Node object.

Task
Complete the insert function in your editor so that it creates a new Node (pass  as the Node constructor argument) and inserts it at the tail of the linked list referenced by the  parameter. Once the new node is added, return the reference to the  node.

Note: The  argument is null for an empty list.

Input Format

The first line contains T, the number of elements to insert.
Each of the next  lines contains an integer to insert at the end of the list.

Output Format

Return a reference to the  node of the linked list.

Sample Input

STDIN   Function
-----   --------
4       T = 4
2       first data = 2
3
4
1       fourth data = 1
Sample Output

2 3 4 1
Explanation

, so your method will insert  nodes into an initially empty list.
First the code returns a new node that contains the data value  as the  of the list. Then create and insert nodes , , and  at the tail of the list.

LinkedListExplanation.png


import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}



To solve the problem of inserting nodes into a linked list, we need to implement the insert function. This function will create a new Node object with the given data and append it to the end of the linked list. If the list is empty, the new node becomes the head of the list.

Heres the step-by-step process:

Check if the head is null:

If the head is null, it means the list is empty, so we create a new node and return it as the head.
Traverse to the end of the list:

If the list is not empty, we traverse the list to find the last node.
Insert the new node:

Create a new node with the given data and set the next pointer of the last node to this new node.


Explanation:
Node Creation:

We create a new Node object using new Node(data).
Empty List Check:

If head is null, we return the new node as the head of the list.
Traversing the List:

We use a while loop to traverse to the last node (current.next != null).
Inserting the Node:

We set the next pointer of the last node to the new node (current.next = newNode).
Returning the Head:

Finally, we return the head to maintain the reference to the beginning of the list.
This code will handle inserting elements into a linked list and then display the list as required.








import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
         Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
    } else {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}