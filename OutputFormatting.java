import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {// This for loop runs exactly 3 times. Each iteration reads a string and an
                                     // integer from the input.
            String s1 = sc.next();
            int x = sc.nextInt();
            // complete this line
            System.out.printf("%-15s%03d%n", s1, x);
            // %-15s: This formats the string (s1) to be left-aligned within a space of 15
            // characters.
            // %03d: This formats the integer (x) as a 3-digit number, padding it with
            // leading zeros if necessary.
            // %n: Inserts a newline character (like \n).
        }
        System.out.println("================================");
    }
}
