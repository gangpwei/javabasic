package com.wgp.easy.num;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * �����������±꣬��ߺ͵����ұߺ�
 * @author gangpeng.wgp
 * @date 2022/12/2 ����1:18
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
        //����Ԫ��֮��
        int sum = Arrays.stream(nums).sum();

        int total = 0;
        for(int i =0; i< nums.length; i++){
            //   ���Ԫ��֮�� == �ұ�Ԫ��֮�� + ��ǰԪ�� = �ܺ�
            //=�����Ԫ��֮�� * 2 + ��ǰԪ�� = �ܺ�
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
