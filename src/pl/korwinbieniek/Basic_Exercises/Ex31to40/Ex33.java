package pl.korwinbieniek.Basic_Exercises.Ex31to40;

import java.util.Scanner;

public class Ex33 {
    public int computeDigits()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int sum = 0;
        while(a != 0)
        {
           sum += a%10;
           a /= 10;
        }
        return sum;
    }
}
