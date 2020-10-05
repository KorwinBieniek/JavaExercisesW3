package pl.korwinbieniek.Basic_Exercises.Ex21to30;

public class Ex30 {
    public String hexToOct(String hex)
    {
        Ex28 dec28 = new Ex28();
        Ex21 oct21 = new Ex21();
        int dec = dec28.hexToDec(hex);
        return oct21.decToOct(dec);
    }
}
