public class Switch {
    public void switchString(String input) {
        switch (input) {
            case "a":
                System.out.println("apple");
            case "b":
                System.out.println("bat");
                break;
            case "B":
                System.out.println("big bat");
            default:
                System.out.println("none");
        }
    }

    public static void main(String[] args) throws Exception {
        Switch tc = new Switch();
        tc.switchString("B");
    }
}
// output: big bat
// none