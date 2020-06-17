package pl.korwinbieniek.Ex51to60;

public class Ex56 {
    public int divisibleRangeOfNo(int x, int y, int p)
    {
        int count = 0;
        for (int i = x; i <= y; i++) {
            if(i%p == 0) count++;
        }
        return count;
    }
}
