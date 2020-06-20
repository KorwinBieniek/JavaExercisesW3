package pl.korwinbieniek.Ex71to80;

public class Ex78 {
    public boolean contains4Or7 (int[] arr1)
    {
        for (int value : arr1) {
            if (value == 7 || value == 4) return true;
        }
        return false;
    }
}
