package pl.korwinbieniek.Array74Exercises;

import java.util.ArrayList;

public class Ar16 {
    public ArrayList<Integer> removeDuplicated(ArrayList<Integer> arr)
    {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if(arr.get(i).equals(arr.get(j)) && i != j){
                    arr.remove(j);
                    j--;
                }
            }
        }
        return arr;
    }
}
