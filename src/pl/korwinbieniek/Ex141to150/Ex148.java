package pl.korwinbieniek.Ex141to150;

public class Ex148 {
    public int firstUniqueChar(String x)
    {
        int p = 0;
        char[] xc = x.toCharArray();

        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < x.length(); j++) {
                if(xc[i] != xc[j]) p++;
            }
        }
        return 0;
    }
}
