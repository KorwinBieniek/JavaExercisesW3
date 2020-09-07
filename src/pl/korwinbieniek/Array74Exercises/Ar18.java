package pl.korwinbieniek.Array74Exercises;

public class Ar18 {
    public int secondSmallest(int[] arr)
    {
        int min = arr[0];
        int min2 = min;

        for (int val : arr) {
            min = Math.min(val, min);
        }
        for (int num : arr) {
            if(num < min2 && num != min) min2 = num;
        }

        return min2;
    }
}
