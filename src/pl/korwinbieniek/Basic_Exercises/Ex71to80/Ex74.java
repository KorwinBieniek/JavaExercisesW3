package pl.korwinbieniek.Basic_Exercises.Ex71to80;

import java.util.Scanner;

public class Ex74 {
    public boolean tenInArray(int[] array)
    {
        Scanner input = new Scanner(System.in);
        if (array.length >= 2)
        {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Input " + (i + 1) + " number: ");
                array[i] = input.nextInt();
                System.out.println();
            }
            return (array[0] == 10 || array[array.length - 1] == 10);
        }else return false;
    }
}
