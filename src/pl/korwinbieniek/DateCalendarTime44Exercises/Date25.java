package pl.korwinbieniek.DateCalendarTime44Exercises;

public class Date25 {
    public void getInfoAboutCurrentYear(int year)
    {
        System.out.println("Current year: " + year);
        boolean flag = false;

        flag = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

        System.out.println("Is current year leap year?: " + flag);
        if(flag) System.out.println("Length of the year: " + 366);
        else
            System.out.println("Length of the year: " + 365);

    }
}
