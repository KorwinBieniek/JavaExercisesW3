package pl.korwinbieniek.Ex71to80;

import java.util.Scanner;

public class Ex75 {
    public boolean firstAndLast(int[] array)
    {
        Scanner input = new Scanner(System.in);
        if (array.length >= 2)
        {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Input " + (i + 1) + " number: ");
                array[i] = input.nextInt();
                System.out.println();
            }
            return (array[0] == array[array.length - 1]);
        }else return false;
    }
}
