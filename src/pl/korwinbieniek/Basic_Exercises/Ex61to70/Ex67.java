package pl.korwinbieniek.Basic_Exercises.Ex61to70;

public class Ex67 {
    public String putInTheMiddle(String x, String addition)
    {
        int space = x.length()/2;
        String spaces = " ";

        for (int i = 0; i < x.length(); i++) {
            if(Character.isWhitespace(x.charAt(i))) space = i;
        }

        x = x.substring(0,space) + spaces + addition + x.substring(space, x.length());
        return x;
    }
}
