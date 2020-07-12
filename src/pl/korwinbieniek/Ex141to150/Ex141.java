package pl.korwinbieniek.Ex141to150;

import java.util.Arrays;

public class Ex141 {
    public int isUnique(String x)
    {
        char[] y = x.toCharArray();
        Arrays.sort(y);
        for (int i = 1; i < x.length(); i++) {
                if(y[i] == y[i-1])
                {
                    System.out.println("non-unique");
                    return 0;
                }
        }
        System.out.println("unique");
        return 1;
    }
}
