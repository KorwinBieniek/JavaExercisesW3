package pl.korwinbieniek.Method16Exercises;

public class Met12 {
    public void printRandMatrix(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 9) + " ");
            }
            System.out.println();
        }
    }
}
