import java.time.LocalDate;
import java.time.Month;

public class LocalDateOf {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
// output: Exception in thread "main" java.time.DateTimeException: Invalid value
// for DayOfMonth (valid values 1 - 28/31): 40
// The code will not compile because you cannot use System.out.println() in this
// way, and the argument to LocalDate.of() must be valid integers (specifically
// for month and day).
