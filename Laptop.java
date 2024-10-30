public class Laptop {
    public void start() {
        try {
            System.out.print("Starting up");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Problem");
            System.exit(0);
        } finally {
            System.out.println("Shutting down");
        }
    }

    public static void main(String[] args) {
        new Laptop().start();
    }
}

// Output:Starting up Problem