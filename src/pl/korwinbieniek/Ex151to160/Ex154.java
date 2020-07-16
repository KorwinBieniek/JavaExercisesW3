package pl.korwinbieniek.Ex151to160;

public class Ex154 {
    public void print2DBoolArray(boolean[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == true) System.out.print("t ");
                else System.out.print("f ");
            }
            System.out.println();
        }
    }
}
