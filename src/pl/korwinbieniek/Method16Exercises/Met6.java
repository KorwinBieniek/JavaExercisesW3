package pl.korwinbieniek.Method16Exercises;

public class Met6 {
    public int computeSumOfDigits(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
