package pl.korwinbieniek.Ex81to90;

public class Ex82 {
    public int firstMidLastArray(int[] arr1)
    {

        int max = arr1[0];
        if(max <= arr1[arr1.length-1])
            max = arr1[arr1.length-1];
        if(max <= arr1[arr1.length/2])
            max = arr1[arr1.length/2];

        return max;
    }
}
