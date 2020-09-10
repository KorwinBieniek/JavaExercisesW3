package pl.korwinbieniek.Method16Exercises;

public class Met16 {
    public boolean isPrime(int num)
    {
        if(num <= 2) return false;

        for (int i = 2; i <= num / 2; i++) {
                if(num % i == 0) return false;
        }
        return true;
    }

    public void pairsOfPrimes()
    {
        for (int i = 1; i < 100; i++) {
            if(isPrime(i))
            {
                if(isPrime(i+2))
                {
                    System.out.println("(" + i + ", " + (i+2) + ")");
                    i+=2;
                }
            }
        }
    }
}
