package pl.korwinbieniek.ConditionalStatement32Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CS31 {
    public void increasingOrDecreasing() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = Integer.parseInt(br.readLine());

        if(first > second && second > third)
            System.out.println("decreasing");
        else if(first < second && second < third)
            System.out.println("increasing");
        else
            System.out.println("Neither increasing or decreasing order");
    }
}
