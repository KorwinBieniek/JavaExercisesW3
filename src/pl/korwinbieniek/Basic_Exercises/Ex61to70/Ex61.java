package pl.korwinbieniek.Basic_Exercises.Ex61to70;

public class Ex61 {
    public void reverseAString(String x)
    {
        char[] word;
        word = x.toCharArray();
        for (int i = x.length()-1; i >= 0; i--) System.out.print(word[i]);
    }
}
