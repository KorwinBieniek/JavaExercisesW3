package pl.korwinbieniek.Ex161to170;

public class Ex168 {
    public int multiplyWithAddition(int x, int y)
    {
        //x * y = z
        int z = 0;
        for (int i = 0; i < y; i++) {
            z += x;
        }
        return z;
    }

}
