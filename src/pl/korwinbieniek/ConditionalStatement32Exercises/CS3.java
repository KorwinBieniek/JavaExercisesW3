package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS3 {
    public void theBiggestNumber(int num1 ,int num2, int num3)
    {
        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The greatest: " + num1);

        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The greatest: " + num2);

        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The greatest: " + num3);
    }
}
