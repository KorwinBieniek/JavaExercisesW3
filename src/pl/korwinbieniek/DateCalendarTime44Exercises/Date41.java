package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date41 {
    public void combineDateAndTime()
    {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        String dateString = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String timeString = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println(dateString + " " + timeString);

        LocalDateTime localDateTime = LocalDateTime.of(date,time);
        System.out.println(localDateTime);
    }
}
