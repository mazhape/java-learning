public class StringBufferExample {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer();
        // StringBuffer sb = new StringBuffer("abcdefgh");
        StringBuffer sb = new StringBuffer("aiswaryaabhi");
        // StringBuffer sb = new StringBuffer("durga");21
        // System.out.println(sb.capacity());// 16
        // sb.append("abcdefghijklmnop");
        // System.out.println(sb.capacity());// 16
        // sb.append("abcdefghijklmnop");
        // sb.append("q");
        // System.out.println(sb.capacity());// 34
        // sb.append("PI Value is : ");
        // sb.append(3.14);
        // sb.append(" it is exactly : ");
        // sb.append(true);
        sb.insert(2, "xyz");
        sb.setLength(8);
        sb.ensureCapacity(1000);
        sb.append("abc");
        sb.trimToSize();
        sb.append("durga").append("software").append("solutions").insert(5, "Srikanth").delete(13, 21)
                .append("SR Nagar").reverse();
        System.out.println(sb.capacity());

    }
}
// append
// output
// PI Value is : 3.14 it is exactly : true

// insert
// output abxyzcdefgh

// delete
// output

// setLength
// output aiswarya

// ensureCapacity
// output 16
// 1000

// trimToSize
// output

// method chaining
// output ragaN RSsnoituloshtnakirSagrud