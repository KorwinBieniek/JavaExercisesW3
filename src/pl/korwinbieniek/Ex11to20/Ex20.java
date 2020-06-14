package pl.korwinbieniek.Ex11to20;

public class Ex20 {

    public String decToHex(int dec)
    {
        int remainder = 0;
        String hexdec ="";
        char[] hex ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(dec > 0)
        {
            remainder = dec%16;
            hexdec = hex[remainder] + hexdec;
            dec /= 16;
        }

        return hexdec;
    }
}
