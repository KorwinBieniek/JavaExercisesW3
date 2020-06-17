package pl.korwinbieniek.Ex51to60;

import java.util.Scanner;

public class Ex52 {
    public boolean equalsThird()
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("Input the first number: ");
        int x = input.nextInt();
        System.out.printf("Input the second number: ");
        int y = input.nextInt();
        System.out.printf("Input the third number: ");
        int z = input.nextInt();

        if((x+y) == z) return true;
        else return false;
    }
}
