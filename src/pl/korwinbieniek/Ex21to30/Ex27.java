package pl.korwinbieniek.Ex21to30;

public class Ex27 {

    public String octToHex(int oct)
    {
        Ex23 hex23 = new Ex23();
        Ex26 bin26 = new Ex26();
        long bin = bin26.octToBin(oct);
        return hex23.binToHex(bin);
    }
}
