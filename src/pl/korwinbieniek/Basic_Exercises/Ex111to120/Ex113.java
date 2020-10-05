package pl.korwinbieniek.Basic_Exercises.Ex111to120;

import java.util.Arrays;

public class Ex113 {
    public int[] newSortedArray(int[] arr1, int[] arr2)
    {
        int j = 0, k = 0;

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[j];

            j++;
        }
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[k];
            k++;
        }
        Arrays.sort(arr3, 0, arr3.length);
        return arr3;
    }
}
