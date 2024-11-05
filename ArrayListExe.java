import java.util.ArrayList;
import java.util.List;

public class ArrayListExe {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.set(1, 1);

        System.out.println(a);
    }
}
// output : [1, 1, 3]