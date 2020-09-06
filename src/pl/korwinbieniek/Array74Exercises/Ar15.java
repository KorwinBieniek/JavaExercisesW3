package pl.korwinbieniek.Array74Exercises;

public class Ar15 {
    public void findCommonValues(String[] arr1, String[] arr2)
    {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i].equals(arr2[j]) && i != j)
                    System.out.println("Common String " + arr1[i]);
            }
        }
    }
}
