package pl.korwinbieniek.Ex101to110;

public class Ex104 {
    public int[] createArrayBefore10(int[] arr1)
    {
        int ctr = 0;


        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 10)
            {
                ctr = i+1;
            }
        }
        int[] arr2 = new int[ctr-1];
        for (int i = 0; i < ctr-1; i++) {
            arr2[i] = arr1[i];
        }
        return arr2;
    }
}
