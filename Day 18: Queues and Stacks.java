Welcome to Day 18! Today we are learning about Stacks and Queues. Check out the Tutorial tab for learning materials and an instructional video!

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backwards and forwards. Can you determine if a given string, , is a palindrome?

To solve this challenge, we must first take each character in , enqueue it in a queue, and also push that same character onto a stack. Once that's done, we must dequeue the first character from the queue and pop the top character off the stack, then compare the two characters to see if they are the same; as long as the characters match, we continue dequeueing, popping, and comparing each character until our containers are empty (a non-match means  isn't a palindrome).

Write the following declarations and implementations:

Two instance variables: one for your , and one for your .
A void pushCharacter(char ch) method that pushes a character onto a stack.
A void enqueueCharacter(char ch) method that enqueues a character in the  instance variable.
A char popCharacter() method that pops and returns the character at the top of the  instance variable.
A char dequeueCharacter() method that dequeues and returns the first character in the  instance variable.
Input Format

You do not need to read anything from stdin. The locked stub code in your editor reads a single line containing string . It then calls the methods specified above to pass each character to your instance variables.

Constraints

 is composed of lowercase English letters.
Output Format

You are not responsible for printing any output to stdout.
If your code is correctly written and  is a palindrome, the locked stub code will print ; otherwise, it will print 

import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}


Explanation:
Instance Variables: We declare a stack and a queue as instance variables.
Constructor: We initialize the stack and the queue in the constructor.
Methods:
pushCharacter(char ch): Pushes a character onto the stack.
enqueueCharacter(char ch): Adds a character to the queue.
popCharacter(): Pops and returns the character at the top of the stack.
dequeueCharacter(): Removes and returns the first character in the queue.
Main Method:
Reads the input string.
Converts the string to a character array.
Creates an instance of the Solution class.
Pushes each character to the stack and enqueues each character to the queue.
Pops characters from the stack and dequeues characters from the queue to compare them.
Checks if the string is a palindrome and prints the result.
This code ensures that we use the stack and queue properly to check if the input string reads the same forwards and backwards, thus determining if it is a palindrome.











import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
      // Instance variables for stack and queue
    Deque<Character> stack = new ArrayDeque<>();
    Deque<Character> queue = new ArrayDeque<>();

    // Pushes a character onto a stack
    void pushCharacter(char ch) {
        stack.push(ch);
    }

    // Enqueues a character in the queue
    void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    // Pops and returns the character at the top of the stack
    char popCharacter() {
        return stack.pop();
    }

    // Dequeues and returns the first character in the queue
    char dequeueCharacter() {
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}