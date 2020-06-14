package pl.korwinbieniek.Ex21to30;

public class Ex21 {

    public String decToOct(int dec)
    {
        int remainder = 0;
        String octal ="";
        char[] oct ={'0','1','2','3','4','5','6','7'};

        while(dec > 0)
        {
            remainder = dec%8;
            octal = oct[remainder] + octal;
            dec /= 8;
        }

        return octal;
    }
}
