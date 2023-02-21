package com.wgp.easy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 找到所有数组中消失的数字
 * 尾部扫描取最大值，放入原数组
 * 从2个数组总长度开始遍历
 *
 * @author weigangpeng
 * @date 2018/01/21 上午11:24
 */

//给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数
//字，并以数组的形式返回结果。

public class E448_findDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        //创建一个空数组，把出现过的数字对应位置的值设置为1
        int[] array = new int[nums.length];
        for (int n : nums) {
            array[n - 1] = 1;
        }

        //遍历数组，把值不等于1的地方放入返回结果中
        List<Integer> result = new ArrayList<Integer>();
        for (int n = 0; n < nums.length; n++) {
            if (array[n] < 1) {
                result.add(n + 1);
            }
        }
        return result;
    }

    @Test
    public void testCase() throws Exception {
        int[] nums1;
        nums1 = new int[] {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDisappearedNumbers(nums1);
        System.out.println(result);

    }

}
