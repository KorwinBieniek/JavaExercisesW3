package pl.korwinbieniek.Basic_Exercises.Ex111to120;

public class Ex120 {
    public boolean findXinMatrix(int[][] marr, int x)
    {
        for (int i = 0; i < marr[0].length; i++) {
            for (int j = 0; j < marr.length; j++) {
                if(marr[j][i] == x) return true;
            }
        }
        return false;
    }
}
