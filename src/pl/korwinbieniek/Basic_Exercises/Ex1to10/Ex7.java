package pl.korwinbieniek.Basic_Exercises.Ex1to10;

public class Ex7 {

    public void printMultiplicationTable()
    {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " * " + j + " = " + (i*j + " "));
            }
            System.out.println();
        }
    }
}
