package pl.korwinbieniek.Basic_Exercises.Ex151to160;

public class Ex158 {
    public void Primes2D (int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(isPrime(arr[i][j])) System.out.print("true ");
                else System.out.print("false ");
            }
            System.out.println();
        }
    }

    public boolean isPrime(int n) {
        boolean flag = false;
        for(int i = 2; i <= n/2; ++i)
        {
            // condition for nonprime number
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
            return false;
    }
}
