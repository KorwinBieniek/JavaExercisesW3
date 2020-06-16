package pl.korwinbieniek.Ex31to40;

public class Ex38 {
    public void countDigits(String x)
    {
        System.out.println("The string is " + x);
        char[] chars = x.toCharArray();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for (int i = 0; i < x.length(); i++) {
            if(Character.isLetter(chars[i])) letter++;
            else if(Character.isSpaceChar(chars[i])) space++;
            else if(Character.isDigit(chars[i])) number++;
            else other++;
        }
        System.out.println("Number of letters: " + letter + "\nNumber of spaces: " + space +
                "\nNumber of digits " + number + "\nNumber of other " + other);
    }
}
