package pl.korwinbieniek.Ex21to30;

public class Ex22 {
    public int binToDec(long a)
    {
        long temp = 0;
        int multiplier = 1;
        int sum = 0;

        while(a > 0) {
            temp = a % 10;
            sum += temp*multiplier;
            multiplier *= 2;
            a /= 10;
        }
        return sum;
    }
}
