package com.wgp.easy.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * 三角形的最大周长
 *
 * 给定由一些正数（代表长度）组成的数组 nums ，返回 由其中三个长度组成的、面积不为零的三角形的最大周长 。
 * 如果不能形成任何面积不为零的三角形，返回 0。
 *
 * @author gangpeng.wgp
 * @date 2023/1/2 上午11:09
 */
public class E976_largestPerimeter {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            //最长边小于，另外2边之和
            if(nums[i] < nums[i-1] + nums[i-2]){
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0;
    }

    @Test
    public void testCase(){
        int[] array = new int[]{2,1,2};
        Assert.assertEquals(largestPerimeter(array), 5);

        array = new int[]{3, 6, 2, 3};
        Assert.assertEquals(largestPerimeter(array), 8);

        array = new int[]{5, 10, 20};
        Assert.assertEquals(largestPerimeter(array), 0);
    }
}
