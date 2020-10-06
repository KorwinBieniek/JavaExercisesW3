package pl.korwinbieniek.StringExercises;

public class Str26 {
    public boolean startsWith(String str1, String str2)
    {
        String[] strings = str2.split(" ");

        return str1.startsWith(strings[0]);
    }
}
