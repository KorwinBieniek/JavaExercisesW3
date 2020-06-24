package pl.korwinbieniek.Ex101to110;

public class Ex107 {
    public boolean increasingAdjacent(int[] arr1)
    {
        boolean check = false;

        for (int i = 2; i < arr1.length - 3; i++) {
            if((arr1[i] + 1 == (arr1[i+1])) && (arr1[i+1] + 1 == (arr1[i+2])))
            {
                check = true;
                break;
            }
        }
        return check;
    }
}
