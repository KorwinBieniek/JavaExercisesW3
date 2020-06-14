package pl.korwinbieniek.Ex11to20;

public class Ex17 {

    public void binarySum(long a, long b)
    {
        int i = 0, remainder = 0;
        int[] sum = new int[20];

        while(a != 0 || b != 0)
        {
            sum[i++] = (int)((a % 10 + b % 10 + remainder) % 2);
            remainder = (int)((a % 10 + b % 10 + remainder) / 2);
            a /= 10;
            b /= 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}
