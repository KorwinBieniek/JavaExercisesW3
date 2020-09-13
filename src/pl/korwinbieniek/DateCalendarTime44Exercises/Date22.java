package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Date22 {
    public void getDaysBeforeAndAfter(long days)
    {
        LocalDate ldt = LocalDate.now();

        System.out.println(ldt);
        System.out.println(ldt.plusDays(days));
        System.out.println(ldt.minusDays(days));
    }
}
