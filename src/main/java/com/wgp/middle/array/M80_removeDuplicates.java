package com.wgp.middle.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * ɾ�����������е��ظ��ʹ��ÿ�������ֵĴ���������2��
 *
 * @author gangpeng.wgp
 * @date 2022/12/2 ����1:18
 */
public class M80_removeDuplicates {
    /**
     * ʹ�ÿ���ָ��
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int slow = 1;
        //��¼��ͬ�����ִ���
        int sameCnt = 1;
        for (int i = 1; i < nums.length; i++) {
            //����ȣ����������㣬��ǰֵ�ŵ���ָ��λ�ã���ָ��������
            if (nums[i] != nums[i - 1]) {
                sameCnt = 1;
                nums[slow] = nums[i];
                slow++;
            }
            //����ȣ�������������2����������1����ǰֵ�ŵ���ָ��λ�ã���ָ��������
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
