package pl.korwinbieniek.ConditionalStatement32Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CS28 {
    public void checkIfLarge() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double num = Double.parseDouble(br.readLine());

        if(num > 0)
        {
            largeOrSmall(num);
            System.out.println("positive");
        }
        else if(num < 0)
        {
            largeOrSmall(num);
            System.out.println("negative");
        }
        else
        {
            largeOrSmall(num);
            System.out.println("zero");
        }

    }

    public void largeOrSmall(double num)
    {
        if(Math.abs(num) < 1)
            System.out.print("small ");
        else if(Math.abs(num) > 1000000)
            System.out.print("large ");
    }
}
