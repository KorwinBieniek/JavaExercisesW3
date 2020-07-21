package pl.korwinbieniek.Ex161to170;

import java.util.Arrays;

public class Ex165 {
    public void shiftNegative(int[] nums) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
