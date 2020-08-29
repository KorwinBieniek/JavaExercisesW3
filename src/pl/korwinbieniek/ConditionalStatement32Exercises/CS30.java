package pl.korwinbieniek.ConditionalStatement32Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CS30 {
    public void equalOrDifferent() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = Integer.parseInt(br.readLine());

        if(first == second && second == third)
            System.out.println("All numbers are equal");
        else if(first != second && first != third && second != third)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }
}
