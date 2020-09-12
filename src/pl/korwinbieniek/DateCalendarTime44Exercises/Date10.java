package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.YearMonth;

public class Date10 {
    public void nameOfFirstAndLastDay()
    {
        YearMonth ym = YearMonth.of(2020, 9);

        System.out.println(ym.atDay(1).getDayOfWeek().name());
        System.out.println(ym.atEndOfMonth().getDayOfWeek().name());
    }
}
