package pl.korwinbieniek.ConditionalStatement32Exercises;

import java.util.Scanner;

public class CS11 {
    public void first10NaturalNumbersSum()
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += n;
        }
        System.out.println("The sum equals: " + sum);
    }
}
