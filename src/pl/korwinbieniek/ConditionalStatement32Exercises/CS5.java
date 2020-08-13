package pl.korwinbieniek.ConditionalStatement32Exercises;

import java.util.Scanner;

public class CS5 {
    public void generateWeekday()
    {
        Scanner input = new Scanner(System.in);
        String[] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.print("Choose a weekday from 1-7: ");
        int choice = input.nextInt();
        System.out.println(weekdays[choice-1]);
    }
}
