package pl.korwinbieniek.Method16Exercises;

public class Met11 {
    public boolean isPasswordValid(String password)
    {
        char[] digits = password.toUpperCase().toCharArray();

        System.out.println("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits.");

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if(password.toUpperCase().charAt(i) >= 'A' && password.toUpperCase().charAt(i) <= 'Z') charCount++;
            else if(password.charAt(i) >= '0' && password.charAt(i) <= '9') numCount++;
            else return false;
        }

        return (charCount >= 2 && numCount >= 2);
    }
}
