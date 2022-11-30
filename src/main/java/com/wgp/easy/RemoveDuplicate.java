package com.wgp.easy;

import java.util.Arrays;

/**
 * 删除重复元素
 *
 * @author gangpeng.wgp
 * @date 2022/5/29 11:54 AM
 */
public class RemoveDuplicate {
    public int[] removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return nums;
        }

        int j = 1;
        for(int i=1; i< nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        nums = new RemoveDuplicate().removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}
