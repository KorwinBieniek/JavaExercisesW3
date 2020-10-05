package pl.korwinbieniek.Basic_Exercises.Ex121to130;

import java.util.Arrays;

public class Ex128 {
    public double findMedian(int[] arr1)
    {
        Arrays.sort(arr1);
        double median;
        if(arr1.length % 2 == 0)
        {
            int sumOfMid = arr1[arr1.length/2]+arr1[arr1.length / 2 -1];
            median = sumOfMid/2;
        }
        else median = arr1[arr1.length/2];
        return median;
    }
}
