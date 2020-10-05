package pl.korwinbieniek.Basic_Exercises.Ex101to110;

public class Ex109 {
    public void numberOfRows(int x)
    {
        int temp = x;
        int row = 0;

        while(x != 0)
        {
            for (int i = 0; i < row && x != 0; i++) {
                System.out.print("$");
                x--;
            }
            System.out.println();
            row++;
        }
        System.out.println("Number of rows: "+((int)((Math.sqrt(8 * (long)temp + 1) - 1) / 2)));
    }
}
