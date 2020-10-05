package pl.korwinbieniek.Basic_Exercises.Ex111to120;

public class Ex112 {

    public static int factorial(int n)
    {
        if (n >= 1)
            return n * factorial(n - 1);
        else return 1;
    }

    public int trailingZerosInFactorial(int n)
    {
        System.out.println(factorial(n));
        int zeros = 0;
        while(n != 0)
        {
            zeros += n / 5;
                    n /= 5;
        }
        return zeros;
    }
}
