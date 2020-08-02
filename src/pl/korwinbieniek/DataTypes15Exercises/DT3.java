package pl.korwinbieniek.DataTypes15Exercises;

public class DT3 {
    public int addDigits(int num)
    {
        int sum = 0;
        int flag = num;

        while(flag > 0)
        {
            sum += flag % 10;
            flag = flag /10;
        }
        return sum;
    }
}
