package pl.korwinbieniek.Array74Exercises;

public class Ar17 {
    public int secondLargest(int[] arr)
    {
        int max = arr[0];
        int max2 = max;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max2 && arr[i] != max) max2 = arr[i];
        }

        return max2;
    }
}
