package pl.korwinbieniek.Ex61to70;

public class Ex65 {
    public int manualModulus(int x, int y)
    {
        while(x >= y) x = x - y;
        return x;
    }
}
