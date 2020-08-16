package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS9 {
    public boolean isLeapYear(int year)
    {
        return((year % 4) == 0 && ((year % 100) != 0 || year % 100 == 0 && year % 400 == 0));
    }
}
