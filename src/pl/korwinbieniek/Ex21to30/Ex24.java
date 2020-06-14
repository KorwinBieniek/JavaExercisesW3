package pl.korwinbieniek.Ex21to30;

import pl.korwinbieniek.Ex11to20.Ex20;

public class Ex24 {

    public String binToHex(long a)
    {
        Ex21 oct21 = new Ex21();
        Ex22 dec22 = new Ex22();
        int x = dec22.binToDec(a);
        return oct21.decToOct(x);
    }
}
