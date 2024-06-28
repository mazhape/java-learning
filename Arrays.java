Task
Given an array, , of  integers, print is elements in reverse order as a single line of space-separated numbers.

Example


Print 4 3 2 1. Each integer is separated by one space.

Input Format

The first line contains an integer,  (the size of our array).
The second line contains  space-separated integers that describe array is elements.

Constraints

Constraints

, where  is the  integer in the array.
Output Format

Print the elements of array  in reverse order as a single line of space-separated numbers.


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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
    }
}


Arrays in Java are a fundamental data structure used to store a fixed-size sequential collection of elements of the same type. They are used to store multiple values in a single variable, instead of declaring separate variables for each value. Here is a deeper look into arrays in Java:

### Declaration

Arrays are declared by specifying the type of elements they will hold, followed by square brackets. For example, to declare an array of integers:

```java
int[] myIntArray;
```

### Instantiation

Arrays are instantiated with the `new` keyword, specifying the size of the array within square brackets:

```java
myIntArray = new int[10]; // An array of 10 integers
```

### Initialization

Arrays can be initialized at the time of declaration:

```java
int[] myIntArray = {1, 2, 3, 4, 5};
```

Or after declaration:

```java
myIntArray[0] = 1;
myIntArray[1] = 2;
// and so on...
```

### Accessing Elements

Array elements are accessed by their index, which starts from 0. To access the first element:

```java
int firstElement = myIntArray[0];
```

### Length of an Array

The length of an array can be obtained by accessing its `length` attribute:

```java
int length = myIntArray.length;
```

### Looping Through Arrays

Arrays are often used with loops to process each element. For example, using a for loop:

```java
for(int i = 0; i < myIntArray.length; i++) {
    System.out.println(myIntArray[i]);
}
```

Or using an enhanced for loop (for-each loop):

```java
for(int element : myIntArray) {
    System.out.println(element);
}
```

### Multidimensional Arrays

Java supports multidimensional arrays, which are arrays of arrays. A two-dimensional array can be thought of as a table with rows and columns:

```java
int[][] my2DArray = new int[10][20]; // A 10x20 array
```

### Limitations and Alternatives

- Arrays have a fixed size. Once declared, their size cannot be changed.
- Arrays hold elements of the same type. For more flexibility, consider using collections like `ArrayList`.

### Example: Reversing an Array

To reverse an array, you can swap elements from the start with elements from the end:

```java
for(int i = 0; i < myIntArray.length / 2; i++) {
    int temp = myIntArray[i];
    myIntArray[i] = myIntArray[myIntArray.length - i - 1];
    myIntArray[myIntArray.length - i - 1] = temp;
}
```

Arrays are a basic but powerful feature in Java, providing the foundation for more complex data structures and algorithms.

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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
            Collections.reverse(arr);
            arr.forEach(i -> System.out.print(i + " "));
        bufferedReader.close();
    }
}

