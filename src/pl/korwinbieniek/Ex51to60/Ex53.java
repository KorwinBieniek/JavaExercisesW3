package pl.korwinbieniek.Ex51to60;

import java.util.Scanner;

public class Ex53 {

    public void greaterThanThird()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int x = input.nextInt();
        System.out.print("Input the second number: ");
        int y = input.nextInt();
        System.out.print("Input the third number: ");
        int z = input.nextInt();

        System.out.print("The result is: " + test(x, y, z, false));
    }

    public static boolean test(int f, int g, int h, boolean abc)
    {
        if(abc) return (f<g);
            return (f<g && g<h);
    }
}
