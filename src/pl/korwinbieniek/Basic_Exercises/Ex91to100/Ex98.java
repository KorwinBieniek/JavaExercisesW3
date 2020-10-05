package pl.korwinbieniek.Basic_Exercises.Ex91to100;

public class Ex98 {
    public boolean TwentyXThree(int[] arr1)
    {
        int times = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 20) times++;
        }
        return times == 3;
    }
}
