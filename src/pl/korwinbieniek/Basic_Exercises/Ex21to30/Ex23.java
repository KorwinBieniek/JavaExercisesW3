package pl.korwinbieniek.Basic_Exercises.Ex21to30;

import pl.korwinbieniek.Basic_Exercises.Ex11to20.Ex20;

public class Ex23 {

    public String binToHex(long a)
    {
        Ex20 hex20 = new Ex20();
        Ex22 dec22 = new Ex22();
        int x = dec22.binToDec(a);
        return hex20.decToHex(x);
    }
}
