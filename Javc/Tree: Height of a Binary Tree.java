The height of a binary tree is the number of edges between the tree'sroot and its furthest leaf.For example,the following binary tree is of height:

image Function Description

Complete the getHeight or height function in the editor.It must return the height of a binary tree as an integer.

getHeight or height has the following parameter(s):

root:a reference to the root of a binary tree.Note-The Height of binary tree with single node is taken as zero.

Input Format

The first line contains an integer,the number of nodes in the tree.Next line contains space separated integer where th integer denotes node[i].data.

Note:Node values are inserted into a binary search tree before a reference to the tree'sroot node is passed to your function.In a binary search tree,all nodes on the left branch of a node are less than the node value.All values on the right branch are greater than the node value.

Constraints

#include<bits/stdc++.h>

using namespace std;

class Node {
    public:
        int data;
        Node *left;
        Node *right;
        Node(int d) {
            data = d;
            left = NULL;
            right = NULL;
        }
};

class Solution {
    public:
  		Node* insert(Node* root, int data) {
            if(root == NULL) {
                return new Node(data);
            } else {
                Node* cur;
                if(data <= root->data) {
                    cur = insert(root->left, data);
                    root->left = cur;
                } else {
                    cur = insert(root->right, data);
                    root->right = cur;
               }

               return root;
           }
        }

    /*
     * The tree node has data, left child and right child
     * class Node {
     * int data;
     * Node* left;
     * Node* right;
     * };
     * 
     */
    int height(Node* root) {
        // Write your code here.
    }

}; // End of Solution

int main() {
  
    Solution myTree;
    Node* root = NULL;
    
    int t;
    int data;

    std::cin >> t;

    while(t-- > 0) {
        std::cin >> data;
        root = myTree.insert(root, data);
    }
  
    int height = myTree.height(root);
    
  	std::cout << height;

    return 0;
}

    you need
    to define
    a recursive
    function that
    calculates the
    height by
    determining the
    number of
    edges between
    the trees
    root and
    its furthest
    leaf.In the
    context of
    the binary tree,
    the height
    of an
    empty tree
    is defined as-1
    and the
    height of
    a tree
    with only
    one node is 0.

    #include<bits/stdc++.h>

using namespace std;

class Node {
    public:
        int data;
        Node *left;
        Node *right;
        Node(int d) {
            data = d;
            left = NULL;
            right = NULL;
        }
};

    class Solution {
    public:
  		Node* insert(Node* root, int data) {
            if(root == NULL) {
                return new Node(data);
            } else {
                Node* cur;
                if(data <= root->data) {
                    cur = insert(root->left, data);
                    root->left = cur;
                } else {
                    cur = insert(root->right, data);
                    root->right = cur;
               }

               return root;
           }
        }

        /*
         * The tree node has data, left child and right child
         * class Node {
         * int data;
         * Node* left;
         * Node* right;
         * };
         * 
         */
    int height(Node* root) {
        // Write your code here.
        if (root == NULL) {
            return -1;  // Base case: the height of an empty tree is -1
        } else {
            // Recursively compute the height of the left and right subtrees
            int leftHeight = height(root->left);
            int rightHeight = height(root->right);
            
            // The height of the current node is the maximum of the heights of its subtrees, plus one
            return max(leftHeight, rightHeight) + 1;
        }
    }
    

}; // End of Solution

int main() {
  
    Solution myTree;
    Node* root = NULL;
    
    int t;
    int data;

    std::cin >> t;

    while(t-- > 0) {
        std::cin >> data;
        root = myTree.insert(root, data);
    }
  
    int height = myTree.height(root);
    
  	std::cout << height;

    return 0;
}
