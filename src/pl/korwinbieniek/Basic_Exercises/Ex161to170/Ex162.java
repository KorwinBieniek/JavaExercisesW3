package pl.korwinbieniek.Basic_Exercises.Ex161to170;

public class Ex162 {
    public void biggerThanAverage(int[] arr1)
    {
        int average = 0;
        for (int i = 0; i < arr1.length; i++) {
            average += arr1[i];
        }
        average /= arr1.length;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] > average) System.out.print(arr1[i] + " ");
        }
    }
}
