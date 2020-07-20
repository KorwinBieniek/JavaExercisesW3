package pl.korwinbieniek;

public class Ex164 {
    public int divisionBySubtraction(int num, int divisor)
    {
        int result = 0;
        while(num > 0)
        {
            result++;
            num -= divisor;
        }
        return result;
    }
}
