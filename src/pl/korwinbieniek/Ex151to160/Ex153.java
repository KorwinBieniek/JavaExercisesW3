package pl.korwinbieniek.Ex151to160;

import java.util.Scanner;

public class Ex153 {
    Scanner scan = new Scanner(System.in);

    public boolean Between0and1() {
        System.out.print("Enter first number: ");
        double x1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double x2 = scan.nextDouble();
        return(x1 > 0 && x1 < 1 && x2 > 0 && x2 < 1);
    }
}
