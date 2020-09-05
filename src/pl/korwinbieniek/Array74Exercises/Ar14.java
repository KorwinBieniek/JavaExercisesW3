package pl.korwinbieniek.Array74Exercises;

public class Ar14 {
    public void findCommonValues(int[] arr1, int[] arr2)
    {
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == arr2[i])
                System.out.println("Common value " + arr1[i]);
        }
    }
}
