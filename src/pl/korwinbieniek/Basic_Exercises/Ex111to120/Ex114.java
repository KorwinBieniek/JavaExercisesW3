package pl.korwinbieniek.Basic_Exercises.Ex111to120;

public class Ex114 {

    public void rotateOffset(String x, int offset)
    {
        char[] y = x.toCharArray();
        char[] z = y;

        for (int i = offset-1; i < y.length; i++) {
            z[i] = y[i];
        }

        for (int i = offset; i < z.length; i++) {
            System.out.print(z[i]);
        }
        for (int i = 0; i < offset; i++) {
            System.out.print(y[i]);
        }
    }
}
