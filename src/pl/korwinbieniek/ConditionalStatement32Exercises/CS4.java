package pl.korwinbieniek.ConditionalStatement32Exercises;

public class CS4 {
    public void smallOrBig(double num)
    {
        if(num == 0)
            System.out.println("zero");
        else if(num > 0)
            System.out.print("positive ");
        else if(num < 0)
            System.out.print("negative ");

        if(num < 1)
            System.out.print("small");
        else if(num > 1000000)
            System.out.print("big");
    }
}
