Task
Given  names and phone numbers, assemble a phone book that maps friends names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for  is not found, print Not found instead.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.

Input Format

The first line contains an integer, , denoting the number of entries in the phone book.
Each of the  subsequent lines describes an entry in the form of  space-separated values on a single line. The first value is a friends name, and the second value is an -digit phone number.

After the  lines of phone book entries, there are an unknown number of lines of queries. Each line (query) contains a  to look up, and you must continue reading lines until there is no more input.

Note: Names consist of lowercase English alphabetic letters and are first names only.

Constraints

Output Format

On a new line for each query, print Not found if the name has no corresponding entry in the phone book; otherwise, print the full  and  in the format name=phoneNumber.


//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
        }
        in.close();
    }
}




Dictionaries and Maps are data structures that store data in key-value pairs, allowing for efficient data retrieval based on the key. In Java, the Map interface represents this concept, and it has several implementations, including HashMap, TreeMap, and LinkedHashMap. Here's a deeper look into dictionaries and maps in Java:

Basics of Map Interface
Key-Value Pair: Each element in a map consists of a key and a value. Keys are unique, but different keys can map to the same value.
Generic Types: Maps use generic types (Map<K, V>) for keys and values. This allows maps to be defined with specific types for keys and values, such as Map<String, Integer>.
Common Implementations
HashMap: Provides the general-purpose implementation of the Map interface. It stores the keys in a hash table, which allows for efficient operations (get and put) in constant time complexity, assuming the hash function disperses the elements properly among the buckets.

TreeMap: Implements the NavigableMap interface and extends AbstractMap. It stores keys in a red-black tree, which orders them based on their natural ordering or by a Comparator provided at map creation time. Operations like get and put have logarithmic time complexity.

LinkedHashMap: Extends HashMap and maintains a linked list of the entries in the map, in the order in which they were inserted. This allows for iterating over the map's entries in insertion order.

Key Operations
Put: Adds a key-value pair to the map. If the map previously contained a mapping for the key, the old value is replaced.

;
Get: Retrieves the value to which the specified key is mapped, or null if the map contains no mapping for the key.

;
ContainsKey: Checks if the map contains a mapping for the specified key.

;
Remove: Removes the mapping for a key from the map if it is present.

;
KeySet: Returns a Set view of the keys contained in the map.

;
Values: Returns a Collection view of the values contained in the map.

;
Iterating Over a Map
You can iterate over the key-value pairs of a map using a for-each loop:

Choosing the Right Map
Use HashMap when you need efficient operations and don't care about the order of entries.
Use TreeMap when you need ordered iteration over the keys.
Use LinkedHashMap when you need to maintain insertion order.
Maps are a powerful tool in Java for organizing and retrieving data efficiently, making them essential for solving problems that involve associating keys with values.



//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
          Map<String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
             phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.containsKey(s)){
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}