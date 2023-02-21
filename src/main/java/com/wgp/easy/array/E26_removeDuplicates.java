package com.wgp.easy.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * 删除有序数组中的重复项
 * @author gangpeng.wgp
 * @date 2022/12/2 上午1:18
 */
public class E26_removeDuplicates {
    /**
     * 使用快慢指针
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        //注意：slow 和 i的起始位置都是1
        int slow = 1;
        for(int i =1; i< nums.length; i++){
            //当前值和前一个值不相等，慢指针向后移动一位
            if(nums[i] != nums[i-1]){
                nums[slow] = nums[i];
                slow ++;
            }
        }
        return slow;
    }

    @Test
    public void testCase(){
        int[] array = new int[]{0, 1, 2, 2, 3, 3, 4};
        Assert.assertEquals(removeDuplicates(array), 5);
    }

}
