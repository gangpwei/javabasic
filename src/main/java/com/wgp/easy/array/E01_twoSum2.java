package com.wgp.easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 2数之和等于目标值，数组为升序数组
 *
 * @author weigangpeng
 * @date 2018/01/21 上午11:24
 */

public class E01_twoSum2 {

    /**
     * 二分法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum0(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            int l = i + 1, r = nums.length -1;
            while (l < r){
                int mid = l + (r - l) / 2;
                if(nums[mid] == target - nums[i]){
                    return new int[]{nums[i], nums[mid]};
                }else if(nums[mid] > target - nums[i]){
                    r = mid -1;
                }else if(nums[mid] < target - nums[i]){
                    l = mid + 1;
                }
            }
        }
        return new int[0];
    }

    /**
     * 双指针
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_twoPointer(int[] nums, int target) {
        int l = 0, r = nums.length -1;
        for (int i=0; i<nums.length; i++){
            while (l <= r){
                int sum = nums[l] + nums[r];
                if(sum == target){
                    return new int[]{nums[l], nums[r]};
                }else if(sum > target){
                    r--;
                }else {
                    l++;
                }
            }
        }
        return new int[0];
    }



    @Test
    public void jia() throws Exception {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = new E01_twoSum2().twoSum0(nums, target);
        System.out.println(Arrays.toString(result));

        result = new E01_twoSum2().twoSum_twoPointer(nums, target);
        System.out.println(Arrays.toString(result));

        nums = new int[]{2,3,4};
        target = 6;

        result = new E01_twoSum2().twoSum0(nums, target);
        System.out.println(Arrays.toString(result));

        result = new E01_twoSum2().twoSum_twoPointer(nums, target);
        System.out.println(Arrays.toString(result));
    }


}