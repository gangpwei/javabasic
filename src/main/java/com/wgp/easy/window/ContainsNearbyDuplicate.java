package com.wgp.easy.window;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsNearbyDuplicate {

    //给你一个整数数组?nums 和一个整数?k ，判断数组中是否存在两个 不同的索引?i?和?j ，满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
    //
    //
    //示例?1：
    //
    //输入：nums = [1,2,3,1], k = 3
    //输出：true

    /**
     * 滑动窗口 + HashSet
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //保存每次滑动窗口出现的元素
        Set<Integer> set = new HashSet<Integer>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            //每次滑动窗口右移，移除上一个窗口的第一个元素
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            //元素重复
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testCase() throws Exception {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        assertFalse(containsNearbyDuplicate(nums, 3));

        int[] nums2 = new int[]{1, 2, 3, 1};
        assertTrue(containsNearbyDuplicate(nums2, 3));
    }

}

