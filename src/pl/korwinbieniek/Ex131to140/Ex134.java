package pl.korwinbieniek.Ex131to140;

public class Ex134 {
    public int climbStairs(int n)
    {
        int[] path = new int[n+1];

        path[0] = 1;
        path[1] = 1;
        for (int i = 2; i <= n; i++) {
            path[i] = path[i-1] + path[i-2];
        }

        return path[n];
    }
}
