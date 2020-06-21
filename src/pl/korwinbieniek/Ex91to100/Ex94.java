package pl.korwinbieniek.Ex91to100;

import java.sql.Array;

public class Ex94 {
    public int[] rearrangeArray(int[] arr1)
    {
        int x = 0;
        int odd = 0;
        int even = 0;
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 == 1) {
                odd = arr1[i];
                arr2[x] = odd;
                x++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 == 0) {
                even = arr1[i];
                arr2[x] = even;
                x++;
            }
        }
        return arr2;
    }
}
