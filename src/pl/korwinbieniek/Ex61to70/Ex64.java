package pl.korwinbieniek.Ex61to70;

import java.util.Scanner;

public class Ex64 {
    public boolean commonDigit()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int x = input.nextInt();
        if (x >= 25 && x <= 75) {
            System.out.print("Input the second number: ");
            int y = input.nextInt();
            if (y >= 25 && y <= 75) {
                if(x%10 == y%10) return true;
                else return (x / 10) % 10 == (y / 10) % 10;
            }
            else System.out.println("Provide value y between 25 and 75");
            return false;
        }
        else System.out.println("Provide value x between 25 and 75");
        return false;
    }
}
