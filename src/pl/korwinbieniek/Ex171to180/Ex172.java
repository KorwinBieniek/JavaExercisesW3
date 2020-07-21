package pl.korwinbieniek.Ex171to180;

public class Ex172 {
    public int smallerThanSize(int[] arr1, int[] arr2)
    {
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] < arr2.length) count++;
        }
        return count;
    }
}
