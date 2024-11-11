import java.util.List;

public class ArraySet {
    public static void main(String[] args) {
        String[] names = { "Tom", "Dick", "Harry" };
        List<String> list = names.asList();
        list.set(0, "Sue");
        System.out.println(names[0]);
    }
}
// output:Compiler error on line 5.
// error: cannot find symbol
// List<String> list = names.asList();
// symbol: method asList()
// location: variable names of type String[]
