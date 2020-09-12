package pl.korwinbieniek.DateCalendarTime44Exercises;

public class Date18 {
    public void checkIfLeapYear(int year)
    {
        System.out.println();
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Year " + year + " is a leap year");
        else
            System.out.println("Year " + year + " is not a leap year");
        System.out.println();
    }
}
