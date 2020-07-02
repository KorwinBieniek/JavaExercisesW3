package pl.korwinbieniek.Ex131to140;

import java.util.Arrays;

public class Ex132 {
    public int returnMax2Duplicates(int[] arr1) {
        Arrays.sort(arr1);
        int x = 1;

        for (int i = 2; i < arr1.length; i++) {
            if (arr1[i] != arr1[x] || (arr1[i] == arr1[x] && arr1[i] != arr1[x - 1])) {
                x++;
                arr1[x] = arr1[i];
            }
        }
        return x + 1;
    }
}
