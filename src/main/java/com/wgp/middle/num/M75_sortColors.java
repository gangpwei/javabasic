package com.wgp.middle.num;

/**
 * 颜色分类
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
class M75_sortColors {

    //给定一个包含红色、白色和蓝色、共?n 个元素的数组?nums?，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
    //
    //我们使用整数 0、?1 和 2 分别表示红色、白色和蓝色。

    /**
     *
     * @param nums
     */
    public void sortColors(int[] nums) {
        int n = nums.length;
        int ptr = 0;
        //把0移到最前面
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) {
                ptr = swap(nums, ptr, i);
            }
        }

        //把1移到o的后面
        for (int i = ptr; i < n; ++i) {
            if (nums[i] == 1) {
                ptr = swap(nums, ptr, i);
            }
        }
    }

    private int swap(int[] nums, int ptr, int i) {
        int temp = nums[i];
        nums[i] = nums[ptr];
        nums[ptr] = temp;
        ++ptr;
        return ptr;
    }
}