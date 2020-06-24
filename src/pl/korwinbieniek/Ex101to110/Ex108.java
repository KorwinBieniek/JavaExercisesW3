package pl.korwinbieniek.Ex101to110;

public class Ex108 {
    public void addDigitsUntilOne(int x)
    {
        if (x>0)
            System.out.print("The single digit number is: "+(x == 0 ? 0 : (x % 9 == 0 ? 9 : x % 9)));
    }
}
