import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<String>();
        mylist.add("A");
        mylist.add("B");
        mylist.add("C");
        mylist.add("D");
        mylist.add("A");

        if (mylist.remove("A")) {
            mylist.remove("B");
        }
        System.out.println(mylist);
    }
}
// output: [C, D, A]