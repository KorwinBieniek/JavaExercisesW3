package pl.korwinbieniek.Ex41to50;

import java.util.Scanner;

public class Ex44 {
    public void calcNs()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        int x1 = x*11;
        int x2 = x*111;

        System.out.println("Output is: " + x + " + " + x1 + " + " + x2 + " = " + (x+x1+x2));
    }
}
