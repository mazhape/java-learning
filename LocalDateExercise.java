import java.time.LocalDate;

public class LocalDateExercise {
    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2020-01-01");
        LocalDate date2 = LocalDate.parse("2020-12-31");

        System.out.println("Date: " + date + " is before " + date2 + "? " + date.isBefore(date2));
    }
}
// Date: 2020-01-01 is before 2020-12-31? true