package com.wgp.easy.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * ɾ�����������е��ظ���
 * @author gangpeng.wgp
 * @date 2022/12/2 ����1:18
 */
public class E26_removeDuplicates {
    /**
     * ʹ�ÿ���ָ��
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        //ע�⣺slow �� i����ʼλ�ö���1
        int slow = 1;
        for(int i =1; i< nums.length; i++){
            //��ǰֵ��ǰһ��ֵ����ȣ���ָ������ƶ�һλ
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
