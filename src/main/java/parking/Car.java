package parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String carId;
    private LocalDateTime enterTime;
    public Car(String carId,LocalDateTime enterTime){
        this.carId = carId;
        this.enterTime = enterTime;
    }

    public int getParkingTime(LocalDateTime leaveTime){
        Duration duration = Duration.between(enterTime,leaveTime);
//        return (int)duration.toMinutes();
    }

    public int parkingFee(int perHoursFee,double getParkingTime){
        int parkingFee = (int)(perHoursFee*getParkingTime);
        return parkingFee;

    }


}
