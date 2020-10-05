package pl.korwinbieniek.Basic_Exercises.Ex191to200;

public class Ex194 {
    public void findNumberInMatrix(int[][] matrix, int num)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == num)
                    System.out.println("(" + (i+1) + ", " + (j+1) + ")");
            }
        }
    }
}
