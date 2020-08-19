package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS18 {
    public void rightAngleTriangleIncreasingBy1(int num)
    {
        int number = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
