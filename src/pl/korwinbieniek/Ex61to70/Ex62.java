package pl.korwinbieniek.Ex61to70;

import java.util.Scanner;

public class Ex62 {
    public boolean moreThanSubstraction()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int x = input.nextInt();
        System.out.print("Input the second number: ");
        int y = input.nextInt();
        System.out.print("Input the third number: ");
        int z = input.nextInt();

        return ((x >= 20) && (x < (y - z)) || x < (z - y)) || ((y >= 20) && (y < (x - z)) || y < (z - x)) || ((z >= 20) && (z < (y - x)) || z < (x - y));
    }
}
