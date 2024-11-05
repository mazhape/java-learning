public class NullPointerExercise {
    public static void main(String[] args) {

        Integer[] a = new Integer[2];

        System.out.println(a[1] + a[0]);

    }
}
// output : Exception in thread "main" java.lang.NullPointerException: Cannot
// invoke "java.lang.Integer.intValue()" because "<local1>[1]" is null
// at A.main(A.java:10)