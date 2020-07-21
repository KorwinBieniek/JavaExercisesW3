package pl.korwinbieniek.Ex161to170;

public class Ex163 {
    public int zeroBits(int num)
    {
        int zeros = 0;
        String bin = "";

        bin = Integer.toBinaryString(num);
        char[] cbin = bin.toCharArray();

        for (int i = 0; i < cbin.length; i++) {
            if(cbin[i] == '0') zeros++;
        }

        return zeros;
    }
}
