public class GarbageExercise {
    String name;
    int phone_num;
    int age;

    public static void main(String[] args) {
        GarbageExercise student = new GarbageExercise();
        GarbageExercise student_2 = new GarbageExercise();
        GarbageExercise student_3 = new GarbageExercise();

        student_2 = student;
        student_3 = student;

    }
}
// output 2