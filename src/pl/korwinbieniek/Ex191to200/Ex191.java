package pl.korwinbieniek.Ex191to200;

public class Ex191 {
    public boolean sumOfSquares(int num)
    {
        int x = 0, y = (int) Math.sqrt(num);

        while(x <= y) {
            if ((x * x + y * y) == num)
                return true;
            else if ((x * x + y * y) != num)
                x++;
            else
                y--;
        }
        return false;
    }
}
