package pl.korwinbieniek.Basic_Exercises.Ex31to40;

public class Ex37 {
    public String reverseString(String x)
    {
        StringBuilder sb = new StringBuilder(x);
        StringBuilder reversed = sb.reverse();

        return reversed.toString();
    }
}
