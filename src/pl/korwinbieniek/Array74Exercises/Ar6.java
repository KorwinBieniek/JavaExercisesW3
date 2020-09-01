package pl.korwinbieniek.Array74Exercises;

public class Ar6 {
    public int findIndex(int[] arr, int val)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == val)
                return i;
        }
        return -1;
    }
}
