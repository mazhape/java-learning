
public class TestStringBuffer {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("durga");
        sb.append("software");
        System.out.println(sb);
        // sb = new StringBuffer("solution");

    }
}
// output : durgasoftware

// on line est.java:7: error: cannot assign a value to final variable sb
// sb = new StringBuffer("solution");
