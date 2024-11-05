import java.util.*;

public class MyStringBuilder {
    public static void main(String args[]) {
        StringBuilder db = new StringBuilder("hello");
        int A = 20;
        String D = "hello";

        System.out.println(db.equals(D));
        System.out.println(db.toString().equals(D));

    }
}
// output false
// output true