import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZonesAndZonedDateTime {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current Time in GMT (Greenwich Mean Time): " + gmtTime.format(formatter));

        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST (Indian Standard Time): " + istTime.format(formatter));

        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Time in PST (Pacific Standard Time): " + pstTime.format(formatter));
    }
}
