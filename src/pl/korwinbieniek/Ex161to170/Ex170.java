package pl.korwinbieniek.Ex161to170;

public class Ex170 {
    public int longestConsecutiveSequence(int[] arr)
    {
        int[] streak = new int[arr.length];
        int x = 0;
        int maxStreak = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] < arr[i]) streak[x]++;
            else x++;
        }
        for (int i = 1; i < streak.length; i++) {
            if(streak[i] > streak[i-1])
                maxStreak = streak[i];
        }
        return maxStreak+1;
    }
}
