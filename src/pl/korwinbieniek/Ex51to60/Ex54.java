package pl.korwinbieniek.Ex51to60;

import java.util.Scanner;

public class Ex54 {
    public boolean rightDigit()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int x = input.nextInt();
        System.out.print("Input the second number: ");
        int y = input.nextInt();
        System.out.print("Input the third number: ");
        int z = input.nextInt();

        return (x % 10) == (y % 10) || (x % 10) == (z % 10) || (y % 10) == (z % 10);
    }
}
