package lesson14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        Date data2 = new Date(0);
        System.out.println(data2);

        double yesrs = (date.getTime() - data2.getTime()) / 1000.0 / 60 / 60 / 24 / 365;
        System.out.println(yesrs);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        System.out.println(calendar);

        System.out.println(Month.JANUARY.ordinal());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        Date timeZoneDate;

        try {
            timeZoneDate = dateFormat.parse("2010-05-23T00:00:00");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println(timeZoneDate);

        ZonedDateTime zonedDateTime = date.toInstant().atZone(ZoneId.of("Asia/Hong_Kong"));
        System.out.println(zonedDateTime);

        dateFormat = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
        String format = dateFormat.format(date);
        System.out.println(format);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1960, Calendar.JANUARY, 1);
        System.out.println(calendar2.getTime());

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime dateTime = LocalDateTime.of(2014, 5, 3, 12, 15, 30);

        dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        LocalDate someDate = localDate.plusMonths(50);
        System.out.println(someDate);

        Period period = Period.between(localDate, someDate);
        System.out.println(period.getYears());


        LocalDateTime dateTime2 = LocalDateTime.of(2014, Month.MAY, 3, 12, 15, 30);


        System.out.println(LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()));
        System.out.println(LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalDate());

        Instant instant = dateTime.toInstant(ZoneOffset.UTC);
        System.out.println(new Date(instant.toEpochMilli() + 1900));

        System.out.println(convertToDateViaSqlDate(localDate));
        System.out.println(dateTime2);
        System.out.println(convertToDateViaSqlTimestamp(dateTime2));
    }

    public static Date convertToDateViaSqlDate(LocalDate localDate) {
        return java.sql.Date.valueOf(localDate);
    }

    public static Date convertToDateViaSqlTimestamp(LocalDateTime localDateTime) {
        return java.sql.Timestamp.valueOf(localDateTime);
    }
}
