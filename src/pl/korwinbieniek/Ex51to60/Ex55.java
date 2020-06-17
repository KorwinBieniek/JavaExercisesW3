package pl.korwinbieniek.Ex51to60;

public class Ex55 {
    public void secondsToTime(int seconds)
    {
        int hours = 0;
        int minutes = 0;
        int secondst = 0;
            secondst = seconds%60;
            hours = seconds/3600;
            minutes = seconds%60;
        System.out.println("The time is: " + hours + ":" + minutes + ":" + secondst);
    }
}
