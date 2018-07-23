package com.company;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int size  = nums.length;
        int i = 0,j = 0;
        for (; i < size; i++) {
            j = i + 1;
            while(nums[i] == nums[j]) {
                j++;
            }
            if(j >= size) {
                break;
            } else {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}
