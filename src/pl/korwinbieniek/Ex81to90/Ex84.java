package pl.korwinbieniek.Ex81to90;

public class Ex84 {
    public String last3Digits(String x)
    {
        return x.substring(x.length()-3) + x + x.substring(x.length()-3);
    }
}
