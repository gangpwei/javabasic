package com.wgp.easy;

/**
 * 移除元素
 * @author gangpeng.wgp
 * @date 2022/11/30 上午12:38
 */
public class E27_RemoveElement {

    //给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
    //
    //不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
    //
    //元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                //不相等，存到新数组的尾部
                nums[slow] = nums[i];
                slow ++;
            }
        }
        return slow;
    }
}
