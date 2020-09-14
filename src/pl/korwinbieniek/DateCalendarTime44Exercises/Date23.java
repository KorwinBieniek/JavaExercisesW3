package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class Date23 {

    public void getRemainingMonths()
    {
        LocalDate today = LocalDate.now();

        LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfYear());

        Period period = today.until(lastDay);

        System.out.println(period.getMonths());
    }



}
