package pl.korwinbieniek.Array74Exercises;

public class Ar22 {
    public void pairsOfNumbersEqualValue(int value, int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == value)
                    System.out.println(arr[i] + " + " + arr[j] + " = " + value);
            }
        }
    }
}
