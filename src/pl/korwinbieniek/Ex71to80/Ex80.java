package pl.korwinbieniek.Ex71to80;

public class Ex80 {
    public int maxFromArray(int[] arr1)
    {
        int max = arr1[0];
        for (int value : arr1) {
            if (value > max) max = value;
        }
        return max;
    }
}
