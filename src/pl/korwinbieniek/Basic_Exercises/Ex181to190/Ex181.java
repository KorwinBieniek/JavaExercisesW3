package pl.korwinbieniek.Basic_Exercises.Ex181to190;

public class Ex181 {
    public int lengthOfTheLastWord(String str)
    {
        int length = 0;

        String[] words = str.split(" ");
        length = words[words.length-1].length();

        return length;
    }
}
