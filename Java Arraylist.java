Sometimes it is better to use dynamic size arrays. Javas Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

ArrayList in Java is a resizable-array implementation of the List interface. It provides a way to store elements sequentially, similar to an array, but with the added advantage of dynamic resizing. Here is a deeper look into ArrayList:

Key Features
Dynamic Resizing: Unlike arrays, ArrayList can grow and shrink dynamically to accommodate adding and removing elements.
Random Access: Provides constant-time positional access to elements, making it efficient to read elements at any position.
Implements List Interface: Inherits abstract methods from the List interface, including operations for adding, removing, and searching elements within the list.
Creating an ArrayList
You can create an ArrayList by specifying the type of elements it can contain using generics:

;
Adding Elements
add(E e): Appends the specified element to the end of the list.
add(int index, E element): Inserts the specified element at the specified position in the list.
;
Accessing Elements
get(int index): Returns the element at the specified position in the list.
"
Removing Elements
remove(Object o): Removes the first occurrence of the specified element from the list.
remove(int index): Removes the element at the specified position in the list.
"
Iterating Over an ArrayList
You can iterate over an ArrayList using a for-each loop, iterator, or traditional for loop:

}
Size and Capacity
size(): Returns the number of elements in the list.
The capacity of an ArrayList is the size of the array used to store the elements. The capacity grows automatically as elements are added to an ArrayList.
Performance Considerations
Random Access: Fast (constant time).
Add/Remove at the End: Fast (amortized constant time).
Add/Remove at the Beginning or Middle: Slow (linear time) because it requires shifting elements.
Use Cases
When you need a resizable array.
When you need to frequently access elements using an index.
Less suitable for lists where you frequently insert or delete elements from the beginning or middle.
ArrayList is part of the Java Collections Framework and is one of the most commonly used implementations of the List interface due to its flexibility and powerful features.


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

for (int i = 0; i < n; i++) {
    int d = scanner.nextInt();
    ArrayList<Integer> line = new ArrayList<>();
    for (int j = 0; j < d; j++) {
        line.add(scanner.nextInt());
    }
    lines.add(line);
}

int q = scanner.nextInt();
for (int i = 0; i < q; i++) {
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    if (x <= lines.size() && y <= lines.get(x - 1).size()) {
        System.out.println(lines.get(x - 1).get(y - 1));
    } else {
        System.out.println("ERROR!");
    }
}
scanner.close();
    }
}