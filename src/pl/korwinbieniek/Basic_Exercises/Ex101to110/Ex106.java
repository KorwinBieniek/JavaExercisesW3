package pl.korwinbieniek.Basic_Exercises.Ex101to110;

public class Ex106 {
    public int[] leftShift(int[] arr1)
    {
        int j = 0;
        int[] arr2 = new int[arr1.length];

        for (int i = 1; i < arr1.length; i++) {
            arr2[j] = arr1[i];
            j++;
        }
        arr2[arr2.length-1] = arr1[0];
        return arr2;
    }

}
