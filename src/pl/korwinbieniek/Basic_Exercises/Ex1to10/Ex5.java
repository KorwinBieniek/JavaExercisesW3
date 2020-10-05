package pl.korwinbieniek.Basic_Exercises.Ex1to10;

import java.util.Scanner;

public class Ex5 {
    Scanner input = new Scanner(System.in);

    public int InputReturn()
    {
        int a = input.nextInt();
        int b = input.nextInt();

        return a * b;
    }
}
