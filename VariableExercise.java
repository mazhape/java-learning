public class VariableExercise {
    public static void main(String[] args) {
        int c = 5;
        String a = "hello";
        final Integer i = 10;
        i = i + 10;

        System.out.println(a + c);

        System.out.println(a + i);
    }
}
// output :java:9: error: cannot assign a value to final variable i
//// i = i + 10;
// 1 error
// error: compilation failed

// explanation:
// final Integer i =10;
// here variable i is declared as final, you can't modify or re-assign a new
// value to final variable.
// so when you try to do so code won't compile
// i = i+10;