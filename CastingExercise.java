i

public class CastingExercise {
    public static void main(String args[]) {
        int a = 4;
        Long b = 400L;
        short c = 5;
        byte d = 6;

        String s1 = (String) (a);
        String s2 = (String) (b);
        String s3 = (String) (c);
        String s4 = (String) (d);

        System.out.println(s4);

    }
}
