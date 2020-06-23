package pl.korwinbieniek.Ex101to110;

public class Ex103 {
    public int[] createArrayAfter10(int[] arr1)
    {
        int ctr = 0;
        int j = 0;


        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 10)
            {
                ctr = i+1;
                break;
            }
        }
        int[] arr2 = new int[arr1.length-ctr];
        for (int i = ctr; i < arr2.length+ctr; i++) {
            arr2[j] = arr1[i];
            j++;
        }
        return arr2;
    }
}
