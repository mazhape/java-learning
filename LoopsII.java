import java.util.*;
import java.io.*;

class LoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of queries

        for (int i = 0; i < t; i++) { // For each query
            int a = in.nextInt(); // Starting number
            int b = in.nextInt(); // Multiplier
            int n = in.nextInt(); // Number of terms

            int sum = a;
            for (int j = 0; j < n; j++) {
                // Add next term: 2^j * b
                sum += (Math.pow(2, j) * b);
                System.out.print(sum + " ");
            }
            System.out.println(); // New line for next query
        }
        in.close();
    }
}