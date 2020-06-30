package pl.korwinbieniek.Ex121to130;

public class Ex129 {
    public int occurOnce(int[] arr1)
    {

        int check = 0;

        for (int i = 0; i < arr1.length; i++) {
            check ^= arr1[i];
        }
        return check;
    }
}
