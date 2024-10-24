import java.util.*;
import java.io.*;

public class Datatypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:"); // Added space after x

                // byte range check
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");

                // short range check: corrected upper bound to 32767
                if (x >= -32768 && x <= 32767)
                    System.out.println("* short");

                // int range check
                if (x >= -2147483648 && x <= 2147483647)
                    System.out.println("* int");

                // long range check: since x is already successfully stored as long,
                // it will always fit in long
                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

    }

}
