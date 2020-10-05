package pl.korwinbieniek.Basic_Exercises.Ex21to30;

public class Ex25 {
    public int octToDec(int oct)
    {
        int dec = 0, i = 0;

        while(oct != 0)
        {
            dec = (int) (dec + (oct%10) * Math.pow(8,i++));
            oct /= 10;
        }
        return dec;
    }
}
