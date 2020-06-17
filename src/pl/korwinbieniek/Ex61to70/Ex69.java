package pl.korwinbieniek.Ex61to70;

public class Ex69 {
    public String returnHalfString(String x)
    {
        if(x.length()%2 != 0) return "The string isn't of even length";
        else return x.substring(0,x.length()/2);
    }
}
