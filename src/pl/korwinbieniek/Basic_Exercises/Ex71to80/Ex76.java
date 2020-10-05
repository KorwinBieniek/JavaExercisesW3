package pl.korwinbieniek.Basic_Exercises.Ex71to80;

import java.util.Scanner;

public class Ex76 {
    public boolean firstAndLastTwo(int[] arr1, int[] arr2)
    {
        Scanner input = new Scanner(System.in);
        if (arr1.length >= 2 && arr2.length >= 2)
        {
            for (int i = 0; i < arr1.length; i++) {
                System.out.print("Input " + (i + 1) + " number: ");
                arr1[i] = input.nextInt();
                System.out.println();
            }

            for (int i = 0; i < arr2.length; i++) {
                System.out.print("Input " + (i + 1) + " number: ");
                arr2[i] = input.nextInt();
                System.out.println();
            }
            return (arr1[0] == arr2[arr2.length - 1]);
        }else return false;
    }
}
