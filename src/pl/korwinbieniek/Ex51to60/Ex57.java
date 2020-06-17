package pl.korwinbieniek.Ex51to60;

public class Ex57 {
    public int countFactors(int x)
    {
        int count = 1;
        for (int i = 1; i < x/2; i++) {
            if(x%i == 0) count++;
        }
        return count;
    }
}
