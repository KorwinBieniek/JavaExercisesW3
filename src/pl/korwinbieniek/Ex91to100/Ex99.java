package pl.korwinbieniek.Ex91to100;

public class Ex99 {
    public boolean AdjacentForSpecific(int[] arr1, int x)
    {
        int flag = 0;
        for (int i = 0; i < arr1.length-1; i++) {
            if (arr1[i] != x && arr1[i + 1] != x) {
                flag = 1;
                break;
            }
        }
        return flag != 1;
    }
}
