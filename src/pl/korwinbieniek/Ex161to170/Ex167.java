package pl.korwinbieniek.Ex161to170;

import java.util.Arrays;

public class Ex167 {
    public void shiftZeros(int[] arr)
    {
        int x = 0;
        int zeros = 0;
        int[] newarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) zeros++;
            else {
                newarr[x] = arr[i];
                x++;
            }
        }
        for (int i = x; i < zeros; i++) {
            newarr[i] = 0;
        }

        System.out.println(Arrays.toString(newarr));
    }
}
