package pl.korwinbieniek.Ex61to70;

public class Ex66 {
    public int sum100Primes() {
        int sum = 1;
        int x = 0;
        int n = 0;
        while (x < 100) {
            n++;
            if (n % 2 != 0) if (isPrime(n)) sum += n;

            x++;
        }
        return sum;
    }

    public boolean isPrime(int n) {
        for (int j = 3; j * j <= n; j += 2) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
