package pl.korwinbieniek.DataTypes15Exercises;

import java.util.Scanner;

public class DT1 {
    public double FahrenheitToCelsius()
    {
        Scanner input = new Scanner(System.in);
        double tempF = input.nextDouble();
        double tempC = (tempF - 32) /1.8;

        return tempC;
    }
}
