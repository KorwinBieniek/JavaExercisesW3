package pl.korwinbieniek.ConditionalStatement32Exercises;

import java.util.Scanner;

public class CS8 {
    public void vowelOrConsonant()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an alphabet letter");
        String in = input.next().toLowerCase();

        boolean uppercase = in.charAt(0) >= 65 && in.charAt(0) <= 90;
        boolean lowercase = in.charAt(0) >= 97 && in.charAt(0) <= 122;
        boolean vowels = in.equals("a") || in.equals("e") || in.equals("i")
                || in.equals("o") || in.equals("u");

        if (in.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
    }
}
