public class Booleans {
    public static void main(String[] args) {

        boolean hasParams = (args == null ? false : true);
        if (hasParams) {
            System.out.println("has params");
        }
        {
            System.out.println("no params");
        }
    }
}
// output: has params
// no params