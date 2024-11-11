public class SwitchCase {
    public static void main(String args[]) {
        int x = Integer.parseInt(args[0]);
        switch (x) {
            case x < 5:
                System.out.println("BIG");
                break;
            case x > 5:
                System.out.println("SMALL");
            default:
                System.out.println("CORRECT");
                break;
        }
    }
}
// output: not compile due to incorrect syntax in the switch statement.
// Case labels cannot be conditions: In Java, the case labels in a switch
// statement must be constant expressions. The conditions x < 5 and x > 5 are
// boolean expressions, which are not allowed as case labels. You cannot use x <
// 5 or x > 5 in the case clauses.

// Switch statement does not support boolean conditions: The switch statement in
// Java works by matching the value of the variable (x in this case) with the
// values specified in the case labels. However, conditions like x < 5 and x > 5
// are not constant values. In fact, switch only supports values of primitive
// types like int, char, String, etc., not boolean expressions.