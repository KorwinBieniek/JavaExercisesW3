package pl.korwinbieniek.Ex81to90;

public class Ex81 {
    public int[] swapTwoArrays(int[] arr1)
    {
        int[] arr3 = new int[arr1.length];
        for (int i = 1; i < arr1.length-1; i++) {
            arr3[i] = arr1[i];
        }
        arr3[0] = arr1[arr1.length-1];
        arr3[arr3.length-1] = arr1[0];

        return arr3;
    }
}
