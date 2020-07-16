package pl.korwinbieniek.Ex151to160;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ex159 {
    public void kBiggest(int[] arr, int k)
    {
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= arr.length-k; i--) {
            System.out.println(arr[i]);
        }
    }
}
