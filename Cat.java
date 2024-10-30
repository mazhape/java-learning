public class Cat {
    public String name;

    public void parseName() {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt(name);
            System.out.print("3");
        } catch (NullPointerException e) {
            System.out.print("4");
            throw e;
        }
        System.out.print("5");
    }

    public static void main(String[] args) {
        Cat leroy = new Cat();
        leroy.name = "Leroy";
        leroy.parseName();
        System.out.print("6");

    }
}
// Output : 12 followed by a stack trace for a NumberFormatException