package pl.korwinbieniek.Method16Exercises;

public class Met3 {
    public String middleChar(String str)
    {
        int half = str.length()/2;
        if(str.length() % 2 == 0)
            return str.substring(half-1, half+1);
        else
            return str.substring(half,half+1);
    }
}
