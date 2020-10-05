package pl.korwinbieniek.Basic_Exercises.Ex81to90;

public class Ex83 {
    public int[] multiplyArray(int[] arr1, int[] arr2)
    {
        int[] arr3 = new int[(arr1.length+arr2.length)/2];
        for (int i = 0; i < (arr1.length+arr2.length)/2; i++) {
            arr3[i] = arr1[i] * arr2[i];
        }
        return arr3;
    }
}
