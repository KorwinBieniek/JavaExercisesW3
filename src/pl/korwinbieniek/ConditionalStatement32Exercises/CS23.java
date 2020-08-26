package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS23 {
    public void reversedHalfTriangle(int row)
    {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
