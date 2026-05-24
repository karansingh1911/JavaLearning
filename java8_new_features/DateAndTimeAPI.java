
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

//There are total 8 classes in this API :  LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Instant, Period, Duration.
public class DateAndTimeAPI {

    public static void main(String[] args) {
        //LocalDate
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate randomDate = LocalDate.of(2000, 11, 19);
        System.out.println(randomDate);

        //LocalTime
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        System.out.println(nowTime.getHour());
        System.out.println(LocalTime.of(12, 30)); // .parse(String),isAfter(),isBefore() also available 

        //LocalDateTime
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        System.out.println(LocalDateTime.of(2000, 11, 19, 1, 34)); // .parse(String),isAfter(),isBefore() also available here as well

        //ZonedDateTime : the only difference is here zone is also specified : LocalDateTime+Zone
        ZonedDateTime zDateTime = ZonedDateTime.now();
        System.out.println(zDateTime);
        System.out.println(zDateTime.getChronology());
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);

        //Instant
        System.out.println(System.currentTimeMillis()); // milliseconds right from 1970, January 12:00
        Instant instant = Instant.now();
        System.out.println(instant);

        //Duration : Represents a duration of time between two points in time: offers precision with nanoSeconds
        Instant instant1 = Instant.now();
        Instant instant2 = Instant.now();
        Duration duration = Duration.between(instant1, instant2);
        System.out.println(duration);// ->P.T.O.S = Period of time -zero seconds

        // Period = longer duration: in days/months/year, ....
        Period period = Period.between(now, randomDate);
        System.out.println(period);

        //DateTimeFormatter
        String date = "19/11/2001";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(parse);

    }
}
