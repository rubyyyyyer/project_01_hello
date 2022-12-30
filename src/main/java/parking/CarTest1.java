package parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class CarTest1 {
    private String carId;
    private LocalDateTime enterTime;
    private LocalDateTime leaveTime;
    private long parkingTimeHour;
    private int parkingFee;


    public CarTest1(String carId, LocalDateTime enterTime, int parkingFee){
        this.carId = carId;
        this.enterTime = enterTime;
        this.parkingFee = parkingFee;
    }

    public void setLeaveTime(LocalDateTime leaveTime){
         if (leaveTime.isAfter(enterTime)){
            this.leaveTime = leaveTime;
        }
    }

    public long getParkingTime(){
        Duration duration = Duration.between(enterTime,leaveTime);
        return duration.toMinutes();
    }
}
