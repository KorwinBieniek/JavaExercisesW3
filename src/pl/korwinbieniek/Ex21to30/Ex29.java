package pl.korwinbieniek.Ex21to30;

public class Ex29 {

    public void hexToBin(String hex)
    {
        Ex28 dec28 = new Ex28();
        int dec = dec28.hexToDec(hex);
        //Dec to bin
        int rem = 0;
        int[] y = new int[20];
        int i = 0;
        while (dec != 0) {
            rem = dec % 2;
            dec /= 2;
            y[i] += rem;
            i++;
        }
        for (int j = i-1; j >= 0; j--) {
            System.out.print(y[j]);
        }
        //end dec to bin
    }
}
