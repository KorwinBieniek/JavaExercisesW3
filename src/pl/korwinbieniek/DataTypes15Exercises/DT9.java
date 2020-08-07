package pl.korwinbieniek.DataTypes15Exercises;

import java.util.Scanner;

public class DT9 {
    Scanner input = new Scanner(System.in);
   public void returnValues()
   {
       System.out.print("Input first number: ");
       int num1 = input.nextInt();
       System.out.print("Input second number: ");
       int num2 = input.nextInt();

       System.out.println((num1 + num2) + "\n" + (num1 - num2) + "\n" +
               (num1*num2) + "\n" + ((num1+num2)/2) + "\n" + (num1 - num2) + "\n" + (Math.max(num1, num2) +
               "\n" + Math.min(num1, num2)));
   }

}
