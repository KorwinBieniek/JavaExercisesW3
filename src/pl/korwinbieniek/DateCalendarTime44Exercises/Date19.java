package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Date19 {
    public void getDifferenceBetweenDates()
    {
        LocalDate today = LocalDate.now();
        LocalDate userday = LocalDate.of(2032, Month.JANUARY, 12);

        Period diff = Period.between(today,userday);
        System.out.println("The difference between " + userday + " and " + today + " is " + diff.getYears() + " Years " + diff.getMonths() + " Months");
    }
}
