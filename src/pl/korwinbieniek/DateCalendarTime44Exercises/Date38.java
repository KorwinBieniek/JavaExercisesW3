package pl.korwinbieniek.DateCalendarTime44Exercises;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Date38 {
    public void differenceInDays()
    {

        LocalDate ld1 = LocalDate.of(2019,1,1);
        LocalDate ld2 = LocalDate.of(2020,5,1);

        System.out.println(Math.abs(ChronoUnit.DAYS.between(ld1,ld2)));
    }
}
