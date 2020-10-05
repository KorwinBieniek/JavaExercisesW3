package pl.korwinbieniek.Basic_Exercises.Ex151to160;

import java.util.Arrays;

public class Ex160 {
    public void kSmallest(int[] arr, int k)
    {
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
}
