package pl.korwinbieniek.Basic_Exercises.Ex21to30;

public class Ex24 {

    public String binToOct(long a)
    {
        Ex21 oct21 = new Ex21();
        Ex22 dec22 = new Ex22();
        int x = dec22.binToDec(a);
        return oct21.decToOct(x);
    }
}
