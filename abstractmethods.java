Common OCA Java 8 Exam Questions 1. What will be the output of the following code?javaCopypublic
class Test {
    public static void main(String[] args) {
        String[] names = { "Tom", "Dick", "Harry" };
        List<String> list = Arrays.asList(names);
        list.set(0, "Sue");
        System.out.println(Arrays.toString(names));
    }}Answer:[Sue,Dick,Harry]Explanation:

    Arrays.asList()

    creates a fixed-size list
    backed by
    the original
    array
Changes
    to the
    list reflect
    in the
    array and
    vice versa
The list
    is fixed-
    size but
    elements can
    be modified
    You cannot
    add or
    remove elements from this list

    2.
    Which statement is true
    about the
    following code?javaCopypublic

    class Animal {
        String name;

        public String getName() {
            return name;
        }
    }

    public class Gorilla extends Animal {
        String name;

        public String getName() {
            return name;
        }
    }Answer:

    This is
    an example
    of variable hiding,
    not overriding.Explanation:

    Instance variables
    cannot be overridden,
    only hidden
    The Gorilla

    class has
    its own
    name variable
    that hides Animal's
    name
The

    getName() method is overridden
Each class has its own copy of the name variable

3. What is the result of the following code?
javaCopyString s1 = "Java";
String s2 = "Java";
StringBuilder sb1 = new StringBuilder("Java");
StringBuilder sb2 = new StringBuilder("Java");
System.out.println(s1 == s2);
System.out.println(sb1 == sb2);
System.out.println(sb1.equals(sb2));
Answer:
Copytrue
false
false
Explanation:

String literals use String pool, so s1 and s2 refer to same object
StringBuilder objects are always new instances
StringBuilder doesn't override equals(), uses Object's equals()

4. What is the output of this code?
javaCopyint x = 1;
while(x < 5) {
    System.out.print(x + " ");
    x++;
    if(x == 3) continue;
}
Answer: 1 2 3 4
Explanation:

continue skips the rest of the loop body
In this case, there's nothing after the if, so continue has no effect
Loop continues until x reaches 5

5. What is the result of this code?
javaCopypublic class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add(7);  // Does this compile?
    }
}
Answer: Does not compile
Explanation:

ArrayList is generically typed to String
Cannot add integer to String ArrayList
This is caught at compile time

6. What happens when this code is executed?
javaCopyint[] array = {1, 2, 3, 4};
int[] copy = array;
copy[0] = 10;
System.out.println(array[0]);
Answer: Prints 10
Explanation:

Arrays are objects in Java
Assignment creates a new reference to same array
Both variables point to same array in memory
Changes through either reference affect same array

7. Which is valid?
javaCopyA. float f1 = 102;
B. float f2 = 102.0;
C. float f3 = 102.0f;
D. float f4 = 102L;
Answer: A, C, and D are valid
Explanation:

Integer literals can be assigned to float (A)
Double literals (102.0) cannot be assigned to float without cast (B invalid)
Float literals need 'f' suffix (C)
Long literals can be assigned to float (D)

8. What is the result?
javaCopyString s = "Hello";
s.concat(" World");
s.toUpperCase();
System.out.println(s);
Answer: Prints Hello
Explanation:

String is immutable
String methods return new String objects
Original String remains unchanged
Need to assign result back to variable to see change

9. What is the output?
javaCopypublic static void main(String[] args) {
    try {
        throw new RuntimeException();
    } catch (RuntimeException | Exception e) {
        System.out.println("Exception caught");
    }
}
Answer: Does not compile
Explanation:

Multi-catch block cannot catch related exceptions
RuntimeException is a subclass of Exception
Remove one of the exception types to fix

10. What is printed?
javaCopypublic class Test {
    static int count;
    int i = 0;
    public void changeCount() {
        while(i < 5) {
            i++;
            count++;
        }
    }
    public static void main(String[] args) {
        Test check1 = new Test();
        Test check2 = new Test();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + " " + check2.count);
    }
}
Answer: Prints 10 10
Explanation:

count is static (shared across all instances)
Each object increments count 5 times
Both references see same static variable
Final value is 10 for both