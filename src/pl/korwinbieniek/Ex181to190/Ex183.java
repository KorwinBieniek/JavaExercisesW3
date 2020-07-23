package pl.korwinbieniek.Ex181to190;

public class Ex183 {
    public int addDigits(int n)
    {
        while (n > 9) {
            int sum_digits = 0;
            while (n != 0) {
                sum_digits += n % 10;
                n /= 10;
            }
            n = sum_digits;
        }
        return n;
    }
}
