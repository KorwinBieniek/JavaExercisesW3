package pl.korwinbieniek.Basic_Exercises.Ex141to150;

import java.util.LinkedList;

public class Ex144 {
    public int removeOccurences(int val, int[] arr)
    {
        LinkedList<Integer> result = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != val)
            {
                result.add(arr[i]);
            }
        }
        return result.size();
    }
}
