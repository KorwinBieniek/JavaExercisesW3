package pl.korwinbieniek.Basic_Exercises.Ex91to100;

public class Ex92 {
    public void oddEvenInArray(int[] arr1)
    {
        int even = 0, odd = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Number of even elements is: " + even + " Number of odd elements is: " + odd);
    }
}
