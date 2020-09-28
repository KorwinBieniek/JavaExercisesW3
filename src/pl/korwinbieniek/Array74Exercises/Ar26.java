package pl.korwinbieniek.Array74Exercises;

import java.util.ArrayList;
import java.util.List;

public class Ar26 {
    public void putAllZerosToTheRight(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list = arrayToList(arr);
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) != 0)
            {
                list1.add(list.get(i));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 0)
                count++;
        }
        for (int i = 0; i < count; i++) {
            list1.add(0);
        }

        arr = listToArray(list1);
        for(int value : arr)
            System.out.print(value + " ");

    }

    public static ArrayList<Integer> arrayToList(int[] arr)
    {
        ArrayList<Integer> intList = new ArrayList<>();
        for(int val : arr)
            intList.add(val);

        return intList;
    }

    public static int[] listToArray(ArrayList<Integer> list)
    {
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
