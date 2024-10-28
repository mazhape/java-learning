public class ComparedValues {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 10) {
        }
        String message = x > 10 ? "Greater than" : false;
        System.out.println(message + ", " + x);
    }
}
// boolean cannot be converted to String
// 1 error
// error: compilation failed