package parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Taster_2 {
    public static void main(String[] args) {
//        java8Before();
//        java8After();
//        parkingTest1();
//        parking
        LocalDateTime enterTime = LocalDateTime.of(2022,12,30,20,0,0);
        LocalDateTime leaveTime = LocalDateTime.of(2022,12,30,22,20,0);
        int perHoursFee = 30;
        Car car = new Car("AA-1234",enterTime);
//        int getParkingTime =(int)(Math.round(car.getParkingTime(leaveTime)/60f*1.0)*1.0);
//        System.out.println("停多久?(分鐘)：" +car.getParkingTime(leaveTime));
//        System.out.println("停多久?(小時)：" +getParkingTime);
//        System.out.println("總共多少錢?：" +car.parkingFee(perHoursFee,getParkingTime));
    }

    private static void parkingTest1() {
        LocalDateTime enterTime =
                LocalDateTime.of(2022,12,30,14,0,0);
        LocalDateTime leaveTime =
                LocalDateTime.of(2022,12,30,16,5,0);
        CarTest1 car = new CarTest1("YY-1234",enterTime,30);
        car.setLeaveTime(leaveTime);
        System.out.println(car.getParkingTime());
        long parkingTimeHour = (long)Math.ceil(car.getParkingTime()/60f);
        System.out.println(parkingTimeHour);
        System.out.println(parkingTimeHour*30);
    }

    private static void java8After() {
        Instant instant = Instant.now();
        System.out.println(instant);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd   HH:mm:ss");
        System.out.println("目前:" + dateTimeFormatter.format(now));

        now.plus(Duration.ofHours(3));
        System.out.println("失敗:" + dateTimeFormatter.format(now) + "\t+3分鐘");

        System.out.println("成功:" + dateTimeFormatter.format(now.plus(Duration.ofHours(3))) + "\t+3分鐘");

        LocalDateTime oneday = LocalDateTime.of(2000,2,20,8,8,20);
        System.out.println(oneday);
    }

    private static void java8Before() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD   HH:mm:ss");
        System.out.println(sdf.format(date));
        String oneday = "2001-09-21   20:20:20";

        try {
            Date otherDay = sdf.parse(oneday);
            System.out.println(otherDay);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,9);
        System.out.println("更改月份:" + calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,3);
        System.out.println("增加天數:" + calendar.getTime());
    }

}
