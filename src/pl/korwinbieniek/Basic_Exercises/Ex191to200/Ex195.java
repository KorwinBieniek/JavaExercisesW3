package pl.korwinbieniek.Basic_Exercises.Ex191to200;

public class Ex195 {
    public boolean canItFormTriangle(int a, int b, int c)
    {
        return (a < (b + c)) && (b < (a + c)) && (c < (a + b));
    }
}
