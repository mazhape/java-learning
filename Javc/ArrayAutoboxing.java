import java.util.ArrayList;
import java.util.List;

public class ArrayAutoboxing {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));// Autoboxing
        ages.add(Integer.valueOf("6"));// does not use autoboxing
        ages.add(7);// autoboxing
        ages.add(null);// does mnot use autoboxing
        for (int age : ages)
            System.out.print(age);

    }
}
// output : 567
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke
// "java.lang.Integer.intValue()" because the return value of
// "java.util.Iterator.next()" is null
// at Lion.main(Lion.java:12)