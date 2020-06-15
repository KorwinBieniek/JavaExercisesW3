package pl.korwinbieniek.Ex21to30;

import pl.korwinbieniek.Ex11to20.Ex19;

public class Ex26 {
    public int octToBin(int oct)
    {
        int[] oct_val = {0, 1, 10, 11, 100, 101, 110, 111};
        int tempoct = oct;
        int place = 1;
        int bin = 0;
        int rem;

        while(tempoct != 0)
        {
            rem = tempoct % 10;
            bin = oct_val[rem] * place + bin;
            tempoct /= 10;
            place *= 1000;
        }
        return bin;
    }
}
