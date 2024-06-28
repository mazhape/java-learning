In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added.(Wikipedia)
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.


import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
		}
		
	}
}



Explanation:
Input Handling:

We read input strings until the end of the file using a while loop.
For each string, we call the isBalanced function and print the result.
isBalanced Function:

We use a Stack<Character> to keep track of the opening brackets.
As we iterate through each character in the string:
If it's an opening bracket, we push it onto the stack.
If it's a closing bracket, we check if the stack is empty or if the top of the stack does not match the corresponding opening bracket. If either condition is met, the string is unbalanced.
After processing all characters, if the stack is empty, the string is balanced. Otherwise, it is unbalanced.
This code ensures that each string is correctly checked for balance and provides the correct output for each input string.















import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
	Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input));
        }
        
        sc.close();
    }
    
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            // Process closing brackets
            else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == '}' && top != '{') || 
                    (c == ']' && top != '[') || 
                    (c == ')' && top != '(')) {
                    return false;
                }
            }
        }
        
        // If stack is empty, then it is balanced
        return stack.isEmpty();
	}
}





