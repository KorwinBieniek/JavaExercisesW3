package pl.korwinbieniek.DataTypes15Exercises;

import java.util.Scanner;

public class DT2 {
    public void inchesToMeters()
    {
        Scanner input = new Scanner(System.in);

        int inches = input.nextInt();
        double meters = inches*0.0254;

        System.out.println(inches + " inches equal " + meters + " meters");
    }
}
