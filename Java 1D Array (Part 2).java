Let's play a game on an array! You're standing at index  of an -element array named . From some index  (where ), you can perform one of the following moves:

Move Backward: If cell  exists and contains a , you can walk back to cell .
Move Forward:
If cell  contains a zero, you can walk to cell .
If cell  contains a zero, you can jump to cell .
If you are standing in cell  or the value of , you can walk or jump off the end of the array and win the game.
In other words, you can move from index  to index , , or  as long as the destination index is a cell containing a . If the destination index is greater than , you win the game.

Function Description

Complete the canWin function in the editor below.

canWin has the following parameters:

int leap: the size of the leap
int game[n]: the array to traverse
Returns

boolean: true if the game can be won, otherwise false
Input Format

The first line contains an integer, , denoting the number of queries (i.e., function calls).
The  subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of  and .
The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values of .
Constraints

It is guaranteed that the value of  is always .





import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}



Explanation:
Function canWin:

Takes leap and the game array as inputs.
Calls the helper function isSolvable to determine if the game can be won.
Helper Function isSolvable:

Checks if the current index i is greater than or equal to the length of the array, in which case you have won the game (return true).
Checks if the current index i is out of bounds or the cell contains 1 (visited or blocked), in which case the move is invalid (return false).
Marks the current cell as visited by setting game[i] = 1.
Recursively tries the three possible moves: moving forward by leap, moving forward by 1, and moving backward by 1.
Main Function:

Reads the number of queries.
For each query, reads the size of the array and the leap value, then the array itself.
Calls canWin for each query and prints "YES" if the game can be won, otherwise "NO".
This solution ensures that all possible moves are tried from each position, and uses recursion to explore all potential paths. Marking cells as visited prevents infinite loops and redundant calculations.

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
            return isSolvable(leap, game, 0);
}

private static boolean isSolvable(int leap, int[] game, int i) {
    // Base cases
    if (i >= game.length) {
        return true; // Win by reaching or jumping beyond the last element
    }
    if (i < 0 || game[i] == 1) {
        return false; // Lose by moving to a position with 1 or moving out of bounds
    }
    game[i] = 1; // Mark this index as visited to avoid loops
    
    // Recursive calls for moving forward, jumping, or moving backward
    return isSolvable(leap, game, i + leap) || 
           isSolvable(leap, game, i + 1) || 
           isSolvable(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}