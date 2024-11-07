import java.util.ArrayList;
import java.util.List;

public class ArrayListExe {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add(7);
        for (String s : list)
            System.out.print(s);

    }
}
// output: error: no suitable method found for add(int)
// list.add(7);
// ^
// method List.add(String) is not applicable
// (argument mismatch; int cannot be converted to String)
// method List.add(int,String) is not applicable
// (actual and formal argument lists differ in length)