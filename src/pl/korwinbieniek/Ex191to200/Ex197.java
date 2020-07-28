package pl.korwinbieniek.Ex191to200;

public class Ex197 {
    public boolean isPerfectSquare(int n)
    {
        int x = n % 10;
        if(x == 2 || x == 3 || x == 7 || x == 8)
            return false;

        for (int i = 0; i < n / 2 + 1; i++) {
            if(i * i == n)
                return true;
        }
        return false;
    }
}
