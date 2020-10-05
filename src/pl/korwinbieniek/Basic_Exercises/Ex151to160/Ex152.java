package pl.korwinbieniek.Basic_Exercises.Ex151to160;

import java.util.Scanner;

public class Ex152 {
    Scanner scan = new Scanner(System.in);

    public void numbersEqual()
    {
        System.out.print("Enter first number: ");
        int x1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int x2 = scan.nextInt();
        System.out.print("Enter third number: ");
        int x3 = scan.nextInt();
        System.out.print("Enter fourth number: ");
        int x4 = scan.nextInt();

        if(x1 == x2 && x2 == x3 && x3 == x4) System.out.println("Numbers are equal");
        else System.out.println("Numbers are NOT equal");
    }
}
