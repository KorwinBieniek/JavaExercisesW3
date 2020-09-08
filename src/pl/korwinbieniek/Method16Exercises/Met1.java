package pl.korwinbieniek.Method16Exercises;

public class Met1 {
    public int minimumOfThreeNumbers(int a, int b, int c)
    {
        int min = a;
        if(min < b)
        {
            if(min > c)
                min = c;
        }
        else
        {
            min = b;
            if(min > c)
                min = c;
        }

        return min;
    }
}
