package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS24 {
    public void reversedHalfTriangleAt(int row)
    {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(' ');
            }
            for (int j = row-i-1; j < row; j++) {
                System.out.print('@');
            }
            System.out.println();
        }
    }
}
