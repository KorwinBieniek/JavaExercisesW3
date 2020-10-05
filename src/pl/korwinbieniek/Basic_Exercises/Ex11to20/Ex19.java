package pl.korwinbieniek.Basic_Exercises.Ex11to20;

public class Ex19 {

    public int[] decToBin(int x)
    {
        int bit = 1;
        int remainder = 0;
        int[] y = new int[20];
        int i = 0;
        while (x != 0) {
            remainder = x % 2;
            x /= 2;
            y[i] += remainder;
            i++;
        }
        return y;
    }
}
