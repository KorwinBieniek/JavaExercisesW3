package pl.korwinbieniek.Ex71to80;

import java.util.Scanner;

public class Ex77 {
    public int[] lastAndFirst(int[] arr1, int[] arr2)
    {
        int[] arr3 = new int[2];

        Scanner input = new Scanner(System.in);
        if (arr1.length >= 2 && arr2.length >= 2) {
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
        }

        arr3[0] = arr1[0];
        arr3[1] = arr2[arr2.length-1];

        return arr3;
    }
}
