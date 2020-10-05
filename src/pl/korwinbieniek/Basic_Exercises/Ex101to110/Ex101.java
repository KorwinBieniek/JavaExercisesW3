package pl.korwinbieniek.Basic_Exercises.Ex101to110;

public class Ex101 {
    public boolean TensAndTwenties(int[] arr1)
    {
        int check1 = 0, check2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 10) check1++;
            if(arr1[i] == 20) check2++;
        }
        return check1>check2;
        }
    }
