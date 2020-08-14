package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS6 {
    public boolean compareFloat(double num1, double num2)
    {
        num1 = Math.round((num1 * 1000));
        num1 /= 1000;

        num2 = Math.round((num2 * 1000));
        num2 /= 1000;

        return num1 == num2;
    }
}
