package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date39 {
    public void stringToDateDateToString()
    {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDateFormatted = LocalDate.parse("01.06.2020", dateFormatter);
        String localDate = dateFormatter.format(localDateFormatted);
    }
}
