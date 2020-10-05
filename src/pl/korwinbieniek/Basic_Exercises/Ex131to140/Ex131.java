package pl.korwinbieniek.Basic_Exercises.Ex131to140;

import java.util.Arrays;

public class Ex131 {
    public int returnNoDuplicated(int[] arr1)
    {
        Arrays.sort(arr1);
        int x = 0;

        for (int i = 1; i < arr1.length; i++) {
            if(arr1[x] != arr1[i])
            {
                arr1[x+1] = arr1[i];
                x++;
            }
        }
        return x+1;
    }
}
