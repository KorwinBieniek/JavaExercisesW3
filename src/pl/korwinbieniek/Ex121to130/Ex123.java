package pl.korwinbieniek.Ex121to130;

public class Ex123 {
    public int smallestSumInSubarray(int[] arr1)
    {
        int min = arr1[0];
        int sum = 0;
        int place = 0;

        while(place < arr1.length)
        {
            sum += arr1[place];
            if(sum > 0) sum = 0;
            else {
                if(sum < min)
                {
                    min = sum;
                }
            }
            place++;
        }
        return min;
    }
}
