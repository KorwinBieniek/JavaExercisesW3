package pl.korwinbieniek.Method16Exercises;

public class Met5 {
    public int countWords(String str)
    {
        String[] words = str.split(" ");
        if(" ".equals(str.substring(0,1)))
            return words.length-1;
        else
            return words.length;
    }
}
