package pl.korwinbieniek.Basic_Exercises.Ex121to130;

public class Ex124 {
    public int findIndex(int[] arr1, int num)
    {
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == num) return i;
        }
        return -1;
    }
}
