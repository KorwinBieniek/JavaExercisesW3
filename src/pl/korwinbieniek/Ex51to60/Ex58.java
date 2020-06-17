package pl.korwinbieniek.Ex51to60;

import java.util.Scanner;

public class Ex58 {
    public void toUpperFirst(String x)
    {
        StringBuilder toUpper = new StringBuilder();
        Scanner lineScan = new Scanner(x);
        while(lineScan.hasNext())
        {
            String word = lineScan.next();
            toUpper.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(toUpper.toString().trim());
    }
}
