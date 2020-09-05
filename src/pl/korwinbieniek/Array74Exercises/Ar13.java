package pl.korwinbieniek.Array74Exercises;

public class Ar13 {
    public void findStringDuplicates(String[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j].equals(arr[i]) && i != j)
                    System.out.println("Duplicate: " + arr[j]);
            }
        }
    }
}
