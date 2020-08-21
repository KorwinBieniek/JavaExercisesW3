package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS20 {
    public void drawFloydTriangle(int row)
    {
        int n = 1;
        for (int i = 0; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
