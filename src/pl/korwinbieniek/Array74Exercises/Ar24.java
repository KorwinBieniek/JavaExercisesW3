package pl.korwinbieniek.Array74Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ar24 {
    public void missingValueFromArray(int[] missingArray) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12};
            List<Integer> firstList = arrayToList(arr);
            List<Integer> secondList = arrayToList(missingArray);

            firstList.removeIf(val -> secondList.contains(val));
        System.out.println("The missing value/values is/are " + firstList);
            }



    public static List<Integer> arrayToList(int[] arr)
    {
        List<Integer> intList = new ArrayList<>();
        for(int val : arr)
            intList.add(val);

        return intList;
    }
}
