package pl.korwinbieniek.Ex1to10;

import java.util.Scanner;

public class Ex6 {
    Scanner input = new Scanner(System.in);

    public void InputCalculations()
    {
        System.out.print("Input first number: ");
        int a = input.nextInt();
        System.out.print("Input second number: ");
        int b = input.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
}
