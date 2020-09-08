package pl.korwinbieniek.Method16Exercises;

import java.util.Scanner;

public class Met8 {
    public void investmentValue()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the investment amount: ");
        int investment = input.nextInt();
        System.out.println("Input the rate of interest: ");
        double rate = input.nextInt();
        System.out.println("Input number of year: ");
        int years = input.nextInt();

        System.out.println("Years          Future Value");

        double value = investment;
        rate *= 0.01;
        for (int i = 1; i <= years; i++) {
            System.out.print(i + "              ");
            System.out.printf("%10.2f\n", investmentIncrease(investment, rate/12, i));
        }
    }

    public double investmentIncrease(double investment, double rate, int years)
    {
        return investment * Math.pow(1 + rate, years * 12);
    }
}
