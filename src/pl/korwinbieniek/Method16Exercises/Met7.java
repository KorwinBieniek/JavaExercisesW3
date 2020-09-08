package pl.korwinbieniek.Method16Exercises;

public class Met7 {
    public int calculatePentagonalNum(int num)
    {
        return num * (3 * num - 1)/2;
    }

    public void first50Pentagonal()
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(calculatePentagonalNum(i*j) + " ");
            }
            System.out.println();
        }
    }
}
