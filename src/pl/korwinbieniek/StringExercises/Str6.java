package pl.korwinbieniek.StringExercises;

public class Str6 {
    public void compareTwoStrings(String str1, String str2)
    {
        if(str1.length() > str2.length())
            System.out.println(str2 + " is shorter than " + str1);
        else if(str1.length() < str2.length())
            System.out.println(str1 + " is shorter than " + str2);
        else
        {
            if(str1.toLowerCase().equals(str2.toLowerCase()))
                System.out.println(str1 + " is equal to " + str2);
            else
                System.out.println(str1 + " is not equal to " + str2);
        }
    }
}
