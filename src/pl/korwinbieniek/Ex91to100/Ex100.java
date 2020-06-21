package pl.korwinbieniek.Ex91to100;

public class Ex100 {
    public int differsByOne(int[] arr1, int[] arr2)
    {
        int check = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(Math.abs(arr1[i] - arr2[i]) <= 1) check++;
        }
        return check;
    }
}
