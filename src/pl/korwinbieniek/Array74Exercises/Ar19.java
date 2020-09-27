package pl.korwinbieniek.Array74Exercises;

public class Ar19 {
    public void addTwoMatrices(int[][] matrix1, int[][] matrix2)
    {
        int[][] matrix3 = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
