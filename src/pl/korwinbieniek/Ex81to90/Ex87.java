package pl.korwinbieniek.Ex81to90;

public class Ex87 {
    public void returnDigitEnglish(int x)
    {
        int temp = x;
        int sum = 0;
        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.print("The digit is: ");
        while(x != 0)
        {
            sum += x%10;
            System.out.print(" " + number[x%10]);
            x /= 10;
        }
        System.out.println("\nSum of the digit in " + temp + " equals: " + sum);
    }
}
