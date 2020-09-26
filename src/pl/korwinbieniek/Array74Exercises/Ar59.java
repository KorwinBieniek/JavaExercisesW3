package pl.korwinbieniek.Array74Exercises;

public class Ar59 {
    public int maximumProduct(int[] arr)
    {
        int maxProduct = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] * arr[i] > maxProduct && i != j)
                    maxProduct = arr[j] * arr[i];
            }
        }
        return maxProduct;
    }
}
