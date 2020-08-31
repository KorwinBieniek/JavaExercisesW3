package pl.korwinbieniek.Array74Exercises;

public class Ar4 {
    public int averageOfArray(int[] array)
    {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum/array.length;
    }
}
