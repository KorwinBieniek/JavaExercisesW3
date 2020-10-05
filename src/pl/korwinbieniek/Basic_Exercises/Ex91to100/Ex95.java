package pl.korwinbieniek.Basic_Exercises.Ex91to100;

public class Ex95 {
    public String[] stringArray(int n)
    {
        int x = 0;
        String[] arr1 = new String[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = String.valueOf(x);
            x++;
        }
        return arr1;
    }
}
