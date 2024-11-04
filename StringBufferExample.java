public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // StringBuffer sb = new StringBuffer("durga");
        System.out.println(sb.capacity());// 16
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());// 16
        sb.append("abcdefghijklmnop");
        sb.append("q");
        System.out.println(sb.capacity());// 34

    }
}