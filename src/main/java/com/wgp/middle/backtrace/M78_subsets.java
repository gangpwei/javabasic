package com.wgp.middle.backtrace;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 全排列
 *
 * @author : gangpeng.wgp
 * @date : 2022/12/5
 */
public class M78_subsets {

    //给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。

    List<List<Integer>> res;
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        res.add(new ArrayList<>());
        backTracing(nums, 0);
        return res;
    }

    public void backTracing(int[] nums, int start){
        // 到数组末尾结束当前递归
        if(start == nums.length){
            return;
        }

        //注意i 从传入的start开始遍历
        for(int i = start; i < nums.length; i++){
            // 将当前数加入list
            list.add(nums[i]);
            res.add(new ArrayList<>(list));
            // 递归 不能重复使用当前数 因此下一轮从i+1开始
            backTracing(nums, i+1);
            // 回溯 回退刚刚加的数
            list.remove(list.size()-1);
        }
    }

    @Test
    public void testCase() throws Exception {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = this.subsets(nums);
        System.out.println(result);

    }
}