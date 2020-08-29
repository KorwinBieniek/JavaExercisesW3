package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS29 {
    public int countDigits(int num)
    {
        int digits = 0;
        while(num > 0)
        {
            digits++;
            num/=10;
        }
        return digits;
    }
}
