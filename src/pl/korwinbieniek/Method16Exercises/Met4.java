package pl.korwinbieniek.Method16Exercises;

public class Met4 {
    public int numberOfVowels(String str)
    {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I'
            || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U')
                sum++;
        }
        return sum;
    }
}
