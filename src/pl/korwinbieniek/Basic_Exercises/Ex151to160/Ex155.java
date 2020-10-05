package pl.korwinbieniek.Basic_Exercises.Ex151to160;

public class Ex155 {
    public void shiftArray(int[][] arr)
    {
        int[][] newarr = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newarr[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr[0].length; j++) {
                System.out.print(newarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
