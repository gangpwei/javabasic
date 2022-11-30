package com.wgp.easy;

/**
 * 搜索插入位置
 * @author gangpeng.wgp
 * @date 2022/11/29 下午11:42
 */
public class E35_SearchInsert {

    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

    //核心思想：在一个有序数组中找第一个大于等于 target 的下标
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        //注意，默认找不到比目标值大的数，所以插入位置默认为数组最后一个
        int ans = n;
        while (left <= right) {
            int mid = (right + left) /2;
            //小于中间节点，查左半区间
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            }
            //大于中间节点，查右半区间
            else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
