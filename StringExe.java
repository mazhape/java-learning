public class StringExe {
    public static void main(String[] args) {

        String str = "Hello";
        modifyString(str);

        System.out.println(str);
    }

    public static void modifyString(String s) {
        s += " World!";
    }
}
// output : Hello