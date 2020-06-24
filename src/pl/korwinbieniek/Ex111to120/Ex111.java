package pl.korwinbieniek.Ex111to120;

public class Ex111 {
    public int addWithoutArithmetics(int a, int b)
    {
        int c = 0;
        while(a != 0)
        {
            c = a & b;
            b = a ^ b;
            a = c << 1;
        }
        return b;
    }
}
