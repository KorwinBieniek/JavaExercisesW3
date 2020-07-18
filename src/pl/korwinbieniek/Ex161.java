package pl.korwinbieniek;

import java.util.Arrays;

public class Ex161 {
    public void kBiggest(int[] arr, int k)
    {
        Arrays.sort(arr);
        System.out.println(k + " biggest");
        for (int i = arr.length-1; i >= arr.length-k; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + k + " smallest");
        for (int j = 0; j < k; j++) {
                System.out.print(arr[j] + " ");
            }
    }
}
