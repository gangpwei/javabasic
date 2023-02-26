package com.wgp.middle.array;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/**
 * 最长连续序列
 * @author : gangpeng.wgp
 * @date : 2022/12/7
 */
public class M128_longestConsecutive {

    public int longestConsecutive(int[] nums) {
        int max = 0;
        int start = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[i-1]){
                start = i;
            }
            max = Math.max(max, i- start + 1);
        }
        return max;
    }

    public int longestConsecutive2(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) {
            numSet.add(num);
        }

        int max = 0;

        for (int num : numSet) {
            //找到连续序列的起点
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                //如果连续，继续遍历
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                max = Math.max(max, currentStreak);
            }
        }

        return max;
    }

    @Test
    public void testCase(){
        int[] array = new int[]{1,4,5,1,3,2};
        Assert.assertEquals(longestConsecutive(array), 3);

        array = new int[]{0,3,7,9,5,8,4,6,0,1};
        Assert.assertEquals(longestConsecutive(array), 4);
    }

    @Test
    public void testCase2(){
        int[] array = new int[]{100,4,200,1,3,2};
        Assert.assertEquals(longestConsecutive2(array), 4);

        array = new int[]{0,3,7,2,5,8,4,6,0,1};
        Assert.assertEquals(longestConsecutive2(array), 9);
    }
}
