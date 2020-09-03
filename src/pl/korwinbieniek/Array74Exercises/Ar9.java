package pl.korwinbieniek.Array74Exercises;

import java.util.Arrays;

public class Ar9 {
    public void insertAtPosition(int[] arr, int val, int index)
    {

        System.out.println("Original array: " + Arrays.toString(arr));

        for (int i = arr.length-1; i > index ; i--) {
            arr[i] = arr[i-1];
        }

        arr[index] = val;

        System.out.println("New array: " + Arrays.toString(arr));
    }
}
