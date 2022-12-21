package parking;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Taster {
    public static void main(String[] args) {
//        java8Before();
        //java8After
        java8After();
    }

    private static void java8After() {
        Instant instant = Instant.now();
        System.out.println(instant);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(now));
        now.plus(Duration.ofHours(3));
        System.out.println(dateTimeFormatter.format(now));
        LocalDateTime other = LocalDateTime.of(2018,9,20,20,20,20);
        System.out.println(other);
    }

    private static void java8Before() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String time = "2022-10-15 20:00:00";
        Date other = null;
        try {
            other = sdf.parse(time);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(other);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,9);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,3);
        System.out.println(calendar.getTime());
    }
}
