package pl.korwinbieniek.Ex111to120;

public class Ex119 {
    public void findElement(int[] arr1, int x)
    {
        int pos = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == x) pos = i+1;
        }
        if(pos != 0)
        System.out.println("The element " + x + " is on the " + pos + " position");
        else
            System.out.println("There is no element " + x);
    }
}
