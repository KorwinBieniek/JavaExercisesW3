package pl.korwinbieniek.Array74Exercises;

public class Ar10 {
    public void findMaxAndMin(int[] arr)
    {
        int max = arr[0], min = arr[0];

        for (int value : arr) {
            if (value > max)
                max = value;
            if (value < min)
                min = value;
        }

        System.out.println("Max: " + max + " Min: " + min);
    }
}
