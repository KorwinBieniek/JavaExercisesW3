package pl.korwinbieniek.Ex131to140;

import java.util.Arrays;

public class Ex132 {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        if(nums==null){
            return 0;
        }

        if (nums.length <= 2){
            return nums.length;
        }

        int i = 1;
        int j = 2;

        while (j < nums.length) {
            if (nums[j] == nums[i] && nums[j] == nums[i - 1]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }
}
