package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalDate;
import java.time.Period;

public class Date30 {
    public void differenceBetweenDaysMonthsYears()
    {
        LocalDate now = LocalDate.now();

        LocalDate yearAgo = LocalDate.now().minusYears(1);

        Period diff = Period.between(yearAgo, now);

        System.out.println(diff.getYears());
    }
}
