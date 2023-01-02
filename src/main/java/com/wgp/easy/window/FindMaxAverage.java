package com.wgp.easy.window;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gangpeng.wgp
 * @date 2022/11/9 3:25 下午
 */
public class FindMaxAverage {

    //给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。
    //
    //请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。
    //
    //任何误差小于 10-5 的答案都将被视为正确答案。
    //
    //
    //示例 1：
    //
    //输入：nums = [1,12,-5,-6,50,3], k = 4
    //输出：12.75
    //解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
    //示例 2：
    //
    //输入：nums = [5], k = 1
    //输出：5.00000


    public double findMaxAverage(int[] nums, int k) {
        //注意，初始值为负无穷
        double maxAvg = Double.NEGATIVE_INFINITY;
        int sum = 0;

        //统计第一个窗口的和
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        int first = nums[0];
        maxAvg = (double)sum / k;

        for (int i = 1; i < nums.length; i++) {
            //注意：数组越界
            if (i + k > nums.length) {
                return maxAvg;
            }
            sum = sum - first + nums[i + k - 1];

            first = nums[i];
            //注意：2个int相除要转double
            double avg = (double)sum / k;
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;
    }

    @Test
    public void runTest() throws Exception {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result =0;

        result= findMaxAverage(nums, k);
        Assert.assertTrue(result == 12.75000);

        nums = new int[] {5};
        k = 1;
        result = findMaxAverage(nums, k);
        Assert.assertTrue(result == 5);

        nums = new int[] {-1};
        k = 1;
        result = findMaxAverage(nums, k);
        Assert.assertTrue(result == -1);

    }
}
