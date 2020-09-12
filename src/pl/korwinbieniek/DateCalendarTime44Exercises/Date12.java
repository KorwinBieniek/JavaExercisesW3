package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class Date12 {
    public void getDaysOfTheWeekLocally()
    {
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("pl"));

        String[] weekdays = symbols.getWeekdays();
                for(String s : weekdays)
                    System.out.println(s);
    }
}
