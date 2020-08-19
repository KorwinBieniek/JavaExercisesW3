package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS16 {
    public void rightAngleTriangle(int num)
    {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
