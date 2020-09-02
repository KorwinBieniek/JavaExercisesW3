package pl.korwinbieniek.Array74Exercises;

public class Ar8 {
    public int[] copyArray(int[] arr)
    {
        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
}
