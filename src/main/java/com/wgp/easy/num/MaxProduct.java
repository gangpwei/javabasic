package com.wgp.easy.num;

import org.junit.Assert;
import org.junit.Test;

/**
 * ���ĳ˻�
 * @author gangpeng.wgp
 * @date 2022/12/2 ����1:18
 */
public class MaxProduct {
    /**
     * ����ɨ��
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            //ע�⣺�������if else �Ͽ�
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        //����1����С2������ * �������
        //����2�����3���������
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }

    @Test
    public void testCase(){
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        Assert.assertEquals(maxProduct(array), 120);

        array = new int[]{-8, -7, 3, 4, 5, 6};
        Assert.assertEquals(maxProduct(array), 336);
    }

}
