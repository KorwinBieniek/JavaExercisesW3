package pl.korwinbieniek.Basic_Exercises.Ex31to40;

import java.nio.charset.Charset;

public class Ex40 {
    public void availableCharSets()
    {
        System.out.println("List of available character sets: ");
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}
