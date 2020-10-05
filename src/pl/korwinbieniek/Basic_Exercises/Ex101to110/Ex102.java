package pl.korwinbieniek.Basic_Exercises.Ex101to110;

public class Ex102 {
    public boolean TensAndThirties(int[] arr1)
    {

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 10 || arr1[i] == 30) return true;
        }
        return false;
    }
}
