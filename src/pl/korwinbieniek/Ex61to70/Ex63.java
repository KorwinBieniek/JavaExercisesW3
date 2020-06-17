package pl.korwinbieniek.Ex61to70;

import java.util.Scanner;

public class Ex63 {
    public int returnBigger()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int x = input.nextInt();
        System.out.print("Input the second number: ");
        int y = input.nextInt();

        if(x==y) return 0;
            if(x % 6 == y % 6) return (x < y) ? x : y;
        return (x < y) ? y : x;
    }
}
