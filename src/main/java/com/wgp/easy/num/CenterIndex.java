package com.wgp.easy.num;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * 求数组中心下标，左边和等于右边和
 * @author gangpeng.wgp
 * @date 2022/12/2 上午1:18
 */
public class CenterIndex {
    /**
     *
     * @param nums
     * @return
     */
    public int centerIndex(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        //所有元素之和
        int sum = Arrays.stream(nums).sum();

        int total = 0;
        for(int i =0; i< nums.length; i++){
            //   左边元素之和 == 右边元素之和 + 当前元素 = 总和
            //=》左边元素之和 * 2 + 当前元素 = 总和
            if(total * 2 + nums[i] == sum){
                return i;
            }
            total += nums[i];
        }
        return -1;
    }

    @Test
    public void testCase(){
        int[] array = new int[]{1, 7, 3, 6, 5, 6};
        Assert.assertEquals(centerIndex(array), 3);
    }

}
