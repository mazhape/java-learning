public class ThisExercise {
    String name;
    int phone_num;
    int age;

    public static void main(String[] args) {
        ThisExercise student = new ThisExercise();

        student.name = "Sunny";
        // this.name="Sunny";

        System.out.println("name :" + student.name);
    }

}
// this and super can't be used inside the main.
// You can use this and super within constructors:)