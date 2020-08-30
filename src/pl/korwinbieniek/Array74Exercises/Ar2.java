package pl.korwinbieniek.Array74Exercises;

public class Ar2 {
    public int sumArray()
    {
        int[] array = new int[20];
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            array[i] = i;
            sum += array[i];
        }
        return sum;
    }
}
