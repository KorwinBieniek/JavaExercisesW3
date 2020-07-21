package pl.korwinbieniek.Ex171to180;

import java.util.Arrays;

public class Ex176 {
    public String secludeOddAndEven(int[] arr) {
        int[] newarr = new int[arr.length];
        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newarr[x] = arr[i];
                x++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                newarr[x] = arr[i];
                x++;
            }
        }
        return Arrays.toString(newarr);
    }
}
