package pl.korwinbieniek.Ex61to70;

public class Ex70 {
    public String concatenateStrings(String x, String y)
    {
        if(x.length() > y.length()) return y+x+y;
        else if(y.length() > x.length()) return x+y+x;
        else return "Błąd, napisy są jednakowej długości";
    }
}
