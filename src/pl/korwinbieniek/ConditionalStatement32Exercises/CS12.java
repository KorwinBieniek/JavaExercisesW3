package pl.korwinbieniek.ConditionalStatement32Exercises;

import java.util.Scanner;

public class CS12 {
    public void averageOf5(int size)
    {
        Scanner input = new Scanner(System.in);
        int[] num = new int[size];
        int sum =0, average = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Input " + (i+1) + " number: ");
            num[i] = input.nextInt();
            sum += num[i];
        }

        average = sum/num.length;
        System.out.println("The sum is: " + sum + "\nThe average is: " + average);
    }
}
