package com.wgp.easy.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * �����ε�����ܳ�
 *
 * ������һЩ�����������ȣ���ɵ����� nums ������ ����������������ɵġ������Ϊ��������ε�����ܳ� ��
 * ��������γ��κ������Ϊ��������Σ����� 0��
 *
 * @author gangpeng.wgp
 * @date 2023/1/2 ����11:09
 */
public class E976_largestPerimeter {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            //���С�ڣ�����2��֮��
            if(nums[i] < nums[i-1] + nums[i-2]){
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0;
    }

    @Test
    public void testCase(){
        int[] array = new int[]{2,1,2};
        Assert.assertEquals(largestPerimeter(array), 5);

        array = new int[]{3, 6, 2, 3};
        Assert.assertEquals(largestPerimeter(array), 8);

        array = new int[]{5, 10, 20};
        Assert.assertEquals(largestPerimeter(array), 0);
    }
}
