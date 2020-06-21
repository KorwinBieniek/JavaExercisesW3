package pl.korwinbieniek.Ex91to100;

public class Ex97 {
    public boolean specificNumberNextTo(int[] arr1, int number)
    {
        for (int i = 0; i < arr1.length; i++) {
            if((arr1[i] == number && arr1[i+1] == number) || (arr1[i] == number && arr1[i+2] == number)) return true;
        }
        return false;
    }
}
