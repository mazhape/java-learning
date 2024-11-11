A binary tree is a tree which is characterized by one of the following properties:

It can be empty (null).
It contains a root node only.
It contains a root node with a left subtree, a right subtree, or both. These subtrees are also binary trees.
In-order traversal is performed as

Traverse the left subtree.
Visit root.
Traverse the right subtree.
For this in-order traversal, start from the left child of the root node and keep exploring the left subtree until you reach a leaf. When you reach a leaf, back up to its parent, check for a right child and visit it if there is one. If there is not a child, you have explored its left and right subtrees fully. If there is a right child, traverse its left subtree then its right in the same manner. Keep doing this until you have traversed the entire tree. You will only store the values of a node as you visit when one of the following is true:

it is the first node visited, the first time visited
it is a leaf, should only be visited once
all of its subtrees have been explored, should only be visited once while this is true
it is the root of the tree, the first time visited
Swapping: Swapping subtrees of a node means that if initially node has left subtree L and right subtree R, then after swapping, the left subtree will be R and the right subtree, L.

For example, in the following tree, we swap children of node 1.



                                Depth
    1               1            [1]
   / \             / \
  2   3     ->    3   2          [2]
   \   \           \   \
    4   5           5   4        [3]
In-order traversal of left tree is 2 4 1 3 5 and of right tree is 3 5 1 2 4.

Swap operation:

We define depth of a node as follows:

The root node is at depth 1.
If the depth of the parent node is d, then the depth of current node will be d+1.
Given a tree and an integer, k, in one operation, we need to swap the subtrees of all the nodes at each depth h, where h ∈ [k, 2k, 3k,...]. In other words, if h is a multiple of k, swap the left and right subtrees of that level.

You are given a tree of n nodes where nodes are indexed from [1..n] and it is rooted at 1. You have to perform t swap operations on it, and after each swap operation print the in-order traversal of the current state of the tree.

Function Description

Complete the swapNodes function in the editor below. It should return a two-dimensional array where each element is an array of integers representing the node indices of an in-order traversal after a swap operation.

swapNodes has the following parameter(s):
- indexes: an array of integers representing index values of each , beginning with , the first element, as the root.
- queries: an array of integers, each representing a  value.

Input Format
The first line contains n, number of nodes in the tree.

Each of the next n lines contains two integers, a b, where a is the index of left child, and b is the index of right child of ith node.

Note: -1 is used to represent a null node.

The next line contains an integer, t, the size of .
Each of the next t lines contains an integer , each being a value .

Output Format
For each k, perform the swap operation and store the indices of your in-order traversal to your result array. After all swap operations have been performed, return your result array for printing.

Constraints

Either  or 
Either  or 
The index of a non-null child will always be greater than that of its parent.
Sample Input 0

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'swapNodes' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY indexes
     *  2. INTEGER_ARRAY queries
     */

    public static List<List<Integer>> swapNodes(List<List<Integer>> indexes, List<Integer> queries) {
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> indexes = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                indexes.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<List<Integer>> result = Result.swapNodes(indexes, queries);

        result.stream()
            .map(
                r -> r.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
            )
            .map(r -> r + "\n")
            .collect(toList())
            .forEach(e -> {
                try {
                    bufferedWriter.write(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

        bufferedReader.close();
        bufferedWriter.close();
    }
}









import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static List<List<Integer>> swapNodes(List<List<Integer>> indexes, List<Integer> queries) {
        List<List<Integer>> result = new ArrayList<>();
        Node root = buildTree(indexes);

        for (int k : queries) {
            swapSubtrees(root, k, 1);
            List<Integer> inOrderTraversal = new ArrayList<>();
            inOrder(root, inOrderTraversal);
            result.add(inOrderTraversal);
        }

        return result;
    }

    private static Node buildTree(List<List<Integer>> indexes) {
        Map<Integer, Node> nodes = new HashMap<>();
        nodes.put(1, new Node(1)); // root

        for (int i = 0; i < indexes.size(); i++) {
            Node current = nodes.computeIfAbsent(i + 1, Node::new);
            List<Integer> children = indexes.get(i);

            if (children.get(0) != -1) {
                current.left = nodes.computeIfAbsent(children.get(0), Node::new);
            }
            if (children.get(1) != -1) {
                current.right = nodes.computeIfAbsent(children.get(1), Node::new);
            }
        }

        return nodes.get(1); // return root
    }

    private static void swapSubtrees(Node node, int k, int depth) {
        if (node == null) return;

        if (depth % k == 0) {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
        }

        swapSubtrees(node.left, k, depth + 1);
        swapSubtrees(node.right, k, depth + 1);
    }

    private static void inOrder(Node node, List<Integer> traversal) {
        if (node == null) return;

        inOrder(node.left, traversal);
        traversal.add(node.data);
        inOrder(node.right, traversal);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> indexes = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                indexes.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<List<Integer>> result = Result.swapNodes(indexes, queries);

        result.stream()
            .map(
                r -> r.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
            )
            .map(r -> r + "\n")
            .collect(toList())
            .forEach(e -> {
                try {
                    bufferedWriter.write(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
