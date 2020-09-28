package pl.korwinbieniek.Array74Exercises;

public class Ar23 {
    public String[] checkEqualityOfArray(int[] arr1, int[] arr2)
    {
        String[] isEqual = new String[arr1.length];

        for (int i = 0; i < arr1.length; i++) {

            isEqual[i] = (arr1[i] == arr2[i] ? "Yes" : "No");
        }

        return isEqual;
    }
}
