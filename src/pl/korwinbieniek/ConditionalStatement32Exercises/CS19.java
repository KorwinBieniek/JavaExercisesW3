package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS19 {
    public void drawPyramid(int row)
    {
        int spaces = row + 3;
        for (int i = 0; i <= row; i++) {
            for (int j = spaces; j != 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            spaces--;
        }
    }
}
