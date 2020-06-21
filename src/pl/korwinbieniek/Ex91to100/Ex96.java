package pl.korwinbieniek.Ex91to100;

public class Ex96 {
    public boolean tenThenTwenty(int[] arr1)
    {
        boolean check = false;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 10)
            {
                check = true;
            }
            if(check) if(arr1[i] == 20) return true;
        }
        return false;
    }
}
