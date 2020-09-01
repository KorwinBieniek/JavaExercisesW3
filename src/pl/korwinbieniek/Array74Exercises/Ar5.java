package pl.korwinbieniek.Array74Exercises;

public class Ar5 {
    public boolean doesContainVal(int[] arr, int val)
    {
        for (int value : arr) {
            if (value == val)
                return true;
        }
        return false;
    }
}
