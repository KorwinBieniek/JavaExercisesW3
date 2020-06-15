package pl.korwinbieniek.Ex31to40;

import java.util.Scanner;

public class Ex32 {
    public void compareTwoNumbers()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        double a = input.nextDouble();
        System.out.print("Enter second number:");
        double b = input.nextDouble();

        if(a != b) System.out.println(a + " != " + b);
        if(a > b) System.out.println(a + " > " + b);
        else if(a < b) System.out.println(a + " < " + b);
        if(a <= b) System.out.println(a + " <= " + b);
        else if (a >= b) System.out.println(a + " >= " + b);
    }
}
