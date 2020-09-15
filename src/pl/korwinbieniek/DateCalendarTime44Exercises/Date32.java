package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalDate;
import java.time.Period;

public class Date32 {
    public void getYourAge()
    {
        LocalDate birthDate = LocalDate.of(1999, 1,14);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(birthDate,now);

        System.out.println("I am " + diff.getYears() + " years old, " + diff.getMonths() + " month old " + diff.getDays() + " days old");
    }
}
