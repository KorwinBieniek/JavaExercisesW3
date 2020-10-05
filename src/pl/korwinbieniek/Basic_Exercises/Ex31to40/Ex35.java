package pl.korwinbieniek.Basic_Exercises.Ex31to40;

public class Ex35 {
    public double polygonArea(int nOsides, int length)
    {
        return (nOsides*(length*length))/(4*Math.tan(Math.PI/nOsides));
    }
}
