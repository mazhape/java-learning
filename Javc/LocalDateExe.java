import java.time.format.DateTimeFormatter;
import java.time.*;

public class LocalDateExe {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        date.plusDays(2);
        date.plusHours(3);
        System.out.println(date.getYear() + +date.getDayOfMonth());
    }
}
// The code does not compile.The code will not compile due to the use of the
// plusHours() method on a LocalDate object.