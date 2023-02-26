package com.wgp.easy.num;

import java.util.Arrays;

/**
 * 丢失的数字
 * @author : gangpeng.wgp
 * @date : 2022/12/3
 */
public class E268_MissingNumber {

    /**
     * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;

    }
}