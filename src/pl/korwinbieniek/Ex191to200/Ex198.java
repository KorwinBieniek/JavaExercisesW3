package pl.korwinbieniek.Ex191to200;

public class Ex198 {
    public static boolean isPrime(int num)
    {
        for (int i = 2; i < num/2+1; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public int primePosition(int num)
    {
        int pos = 0;
        for (int i = 1; i < num; i++) {
            if(isPrime(i))
                pos++;
        }
        return pos;
    }
}
