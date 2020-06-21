package pl.korwinbieniek.Ex91to100;

public class Ex93 {
    public boolean next10Next20(int[] arr1)
    {
        boolean twenty = false;
        boolean ten = false;

        for (int i = 0; i < arr1.length-1; i++) {
            if(arr1[i] == 10 && arr1[i+1] == 10) ten = true;
            if(arr1[i] == 20 && arr1[i+1] == 20) twenty = true;
        }
        if(ten && twenty) return false;
        else if(ten) return true;
        else return twenty;
    }
}
