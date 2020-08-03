package pl.korwinbieniek.DataTypes15Exercises;

import java.time.LocalDateTime;
import java.util.Date;

public class DT5 {
    public void printDate()
    {
        Date date = java.util.Calendar.getInstance().getTime();
        System.out.println(date);
    }
}
