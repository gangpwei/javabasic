package com.wgp.middle.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 删除有序数组中的重复项，使得每个数出现的次数不超过2个
 *
 * @author gangpeng.wgp
 * @date 2022/12/2 上午1:18
 */
public class M80_removeDuplicates {
    /**
     * 使用快慢指针
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int slow = 1;
        //记录相同数出现次数
        int sameCnt = 1;
        for (int i = 1; i < nums.length; i++) {
            //不相等，计数器清零，当前值放到慢指针位置，慢指针往后移
            if (nums[i] != nums[i - 1]) {
                sameCnt = 1;
                nums[slow] = nums[i];
                slow++;
            }
            //不相等，计数器不超过2，计数器加1，当前值放到慢指针位置，慢指针往后移
            else if (sameCnt < 2) {
                sameCnt++;
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }

    @Test
    public void testCase() throws Exception {
        assertEquals(removeDuplicates(new int[] {1, 2, 3, 3, 3, 4, 4, 4}), 6);

        assertEquals(removeDuplicates(new int[] {1, 1, 3, 3, 3, 3, 3, 4}), 5);
    }

}
