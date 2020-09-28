package pl.korwinbieniek.Array74Exercises;

public class Ar25 {
    public void findCommonElementsFromThreeSortedArrays()
    {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] arr3 = {1,3,5,6,9};

        int x = 0, y = 0, z = 0;

        while(x < arr1.length && y < arr2.length && z < arr3.length)
        {
            if(arr1[x] == arr2[y] && arr2[y] == arr3[z])
            {
                System.out.println("The value " + arr1[x] + " is common in these three arrays");
                x++;
                y++;
                z++;
            }
            else if(arr1[x] < arr2[y])
                x++;
            else if(arr2[y] < arr3[z])
                y++;
            else
                z++;
        }
    }
}
