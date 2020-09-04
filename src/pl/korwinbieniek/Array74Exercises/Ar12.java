package pl.korwinbieniek.Array74Exercises;

public class Ar12 {
    public void findDuplicates(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] == arr[i] && i != j)
                    System.out.println("Duplicate: " + arr[j]);
            }
        }
    }
}
