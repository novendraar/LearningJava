import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Day03 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("eeee, dd-MM-yy HH:mm:ss", Locale.forLanguageTag("id-ID"));
        System.out.println(formater.format(dateTime));
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
    }
}
