import java.time.LocalDate;

public class LocalTimeExercise {
    public class A {
        public static void main(String[] args) {

            LocalDate date = LocalDate.of(2018, 02, 02);

            System.out.println(date.getMonthValue());

        }

    }
}// output 2
 // Explanation:
 // this method returns an int value of month that is present in object of
 // LocalDate.
 // the function returns the month of the year from 1-12 in numbers.
 // in the code the date is 2018-02-02
 // year is 2018-02-02 month is 02 date is 2
 // hence 2 is printed