package pl.korwinbieniek.DataTypes15Exercises;

public class DT10 {
    public void sequenceOfDigits(long number)
    {
        StringBuilder sb = new StringBuilder();
        StringBuilder nums = null;
        long temp;
        while(number > 0)
        {
            temp = number;
            sb.append(temp %10);
            sb.append(" ");
            number /= 10;
        }
        sb.reverse();
        System.out.println(sb);
    }
}
