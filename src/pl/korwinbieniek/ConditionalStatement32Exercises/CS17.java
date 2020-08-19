package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS17 {
    public void rowsWithSameNumber(int num)
    {
        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
