package pl.korwinbieniek.Basic_Exercises.Ex121to130;

public class Ex122 {
    public int biggestSumInSubarray(int[] arr1)
    {
        int max = arr1[0];
        int sum = 0;
        int place = 0;

        while(place < arr1.length)
        {
            sum += arr1[place];
            if(sum < 0) sum = 0;
            else {
                if(sum > max)
                {
                    max = sum;
                }
            }
            place++;
        }
        return max;
    }
}
