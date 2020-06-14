package pl.korwinbieniek.Ex11to20;

public class Ex15 {

    public void swapNumbers(int a, int b)
    {
        System.out.println("Before swap: a:" + a + " b:" + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a:" + a + " b:" + b);
    }
}
