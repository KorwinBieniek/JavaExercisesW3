package pl.korwinbieniek.Array74Exercises;

public class Ar11 {
    public int[] reverseArray(int[] arr)
    {
        int[] reversed = new int[arr.length];
        int x = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            reversed[x] = arr[i];
            x++;
        }
        return reversed;
    }
}
