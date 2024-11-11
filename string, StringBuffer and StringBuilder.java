Here are some common OCA (Oracle Certified Associate) exam-style questions on the topics of String, StringBuffer, and StringBuilder in Java:

1. String immutability
Question:
What is the output of the following code?

java
Copy code
String s1 = "Java";
String s2 = s1;
s1 = s1.concat(" Programming");
System.out.println(s1);
System.out.println(s2);
Options: a) Java Programming
b) Java
c) Java Programming Java
d) Compilation error

Answer:

Output:
Copy code
Java Programming
Java
Explanation: Strings in Java are immutable, so s1.concat(" Programming") creates a new string but doesn't change s1. s2 still refers to the original "Java".
2. StringBuilder methods
Question:
What is the result of the following code?

java
Copy code
StringBuilder sb = new StringBuilder("OCA");
sb.append(" Exam");
System.out.println(sb);
Options: a) OCA
b) Exam OCA
c) OCA Exam
d) Compilation error

Answer:

Output:
Copy code
OCA Exam
Explanation: StringBuilder is mutable, so the append() method modifies the original sb object by adding " Exam".
3. String vs StringBuilder comparison
Question:
Which statement is true regarding String and StringBuilder?

Options: a) Both String and StringBuilder are immutable.
b) Both String and StringBuilder are mutable.
c) String is immutable, but StringBuilder is mutable.
d) String is mutable, but StringBuilder is immutable.

Answer:

Correct:
c) String is immutable, but StringBuilder is mutable.
Explanation: Strings in Java cannot be modified after creation (immutable), while StringBuilder allows modification (mutable).
4. String concatenation
Question:
What will be the output of the following code?

java
Copy code
String s1 = "OCA";
String s2 = s1 + " Exam";
System.out.println(s2);
Options: a) OCA Exam
b) OCA
c) Compilation error
d) Exam OCA

Answer:

Output:
Copy code
OCA Exam
Explanation: When you use the + operator with String, Java creates a new string and stores it in s2. The original s1 is unchanged.
5. StringBuffer replace method
Question:
What is the output of the following code?

java
Copy code
StringBuffer sb = new StringBuffer("Hello World");
sb.replace(6, 11, "Java");
System.out.println(sb);
Options: a) Hello Java
b) Hello World
c) Java World
d) Compilation error

Answer:

Output:
Copy code
Hello Java
Explanation: The replace() method replaces the portion of the string from index 6 to 11 with "Java", modifying the original StringBuffer.
6. StringBuilder reverse method
Question:
What is the output of the following code?

java
Copy code
StringBuilder sb = new StringBuilder("ABCDEF");
sb.reverse();
System.out.println(sb);
Options: a) FEDCBA
b) ABCDEF
c) Compilation error
d) None of the above

Answer:

Output:
Copy code
FEDCBA
Explanation: The reverse() method reverses the order of the characters in the StringBuilder.
7. StringBuilder vs StringBuffer performance
Question:
Which of the following is true about StringBuffer and StringBuilder?

Options: a) StringBuffer is faster than StringBuilder.
b) StringBuilder is thread-safe, but StringBuffer is not.
c) StringBuffer is thread-safe, but StringBuilder is not.
d) Both StringBuffer and StringBuilder are thread-safe.

Answer:

Correct:
c) StringBuffer is thread-safe, but StringBuilder is not.
Explanation: StringBuffer is synchronized and thread-safe, while StringBuilder is not, making StringBuilder faster in single-threaded environments.
8. Comparing strings
Question:
What is the result of the following code?

java
Copy code
String s1 = "abc";
String s2 = "abc";
System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
Options: a) false true
b) true false
c) true true
d) false false

Answer:

Output:
arduino
Copy code
true
true
Explanation: Both s1 and s2 refer to the same string literal in the string pool, so == compares their references, which are the same, and equals() checks their content.
