Given a pointer to the root of a binary tree, print the top view of the binary tree.

The tree as seen from the top the nodes, is called the top view of the tree.

For example :

   1
    \
     2
      \
       5
      /  \
     3    6
      \
       4
Top View : 

Complete the function  and print the resulting values on a single line separated by space.

Input Format

You are given a function,

void topView(node * root) {

}
Constraints

 Nodes in the tree  




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

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
      
      
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
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
        topView(root);
    }	
}



To implement the topView method to print the top view of a binary tree, you can follow these steps:

Use a TreeMap to Store Node Values with Horizontal Distance: TreeMap is chosen because it automatically sorts the keys. The horizontal distance (HD) is used as the key. For the root, HD is 0. For the left child, HD is parent's HD minus 1. For the right child, HD is parent's HD plus 1. Only the first node encountered at each horizontal distance from the top is part of the top view.

Level Order Traversal with Modification: Perform a level order traversal using a queue, but modify it to store nodes along with their horizontal distance. This ensures that if two nodes have the same HD, the one encountered first (topmost in the tree) is processed.

Update TreeMap Only if HD is Not Present: When processing each node, check if its HD is already present in the TreeMap. If not, add it. This ensures only the first (topmost) node at each HD is considered for the top view.

Print the TreeMap Values: The TreeMaps values now represent the top view of the binary tree.

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

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
      
      class QueueObj {
        Node node;
        int hd; // Horizontal Distance

        QueueObj(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    Queue<QueueObj> q = new LinkedList<>();
    Map<Integer, Node> topViewMap = new TreeMap<>();

    if (root == null) {
        return;
    } else {
        q.add(new QueueObj(root, 0));
    }

    // Level order traversal
    while (!q.isEmpty()) {
        QueueObj tmpNode = q.poll();
        if (!topViewMap.containsKey(tmpNode.hd)) {
            topViewMap.put(tmpNode.hd, tmpNode.node);
        }

        if (tmpNode.node.left != null) {
            q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1));
        }
        if (tmpNode.node.right != null) {
            q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1));
        }
    }

    for (Map.Entry<Integer, Node> entry : topViewMap.entrySet()) {
        System.out.print(entry.getValue().data + " ");
    }
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
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
        topView(root);
    }	
}