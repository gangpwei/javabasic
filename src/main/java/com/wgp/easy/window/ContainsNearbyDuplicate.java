package com.wgp.easy.window;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsNearbyDuplicate {

    //����һ����������?nums ��һ������?k ���ж��������Ƿ�������� ��ͬ������?i?��?j ������ nums[i] == nums[j] �� abs(i - j) <= k ��������ڣ����� true �����򣬷��� false ��
    //
    //
    //ʾ��?1��
    //
    //���룺nums = [1,2,3,1], k = 3
    //�����true

    /**
     * �������� + HashSet
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //����ÿ�λ������ڳ��ֵ�Ԫ��
        Set<Integer> set = new HashSet<Integer>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            //ÿ�λ����������ƣ��Ƴ���һ�����ڵĵ�һ��Ԫ��
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            //Ԫ���ظ�
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testCase() throws Exception {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        assertFalse(containsNearbyDuplicate(nums, 3));

        int[] nums2 = new int[]{1, 2, 3, 1};
        assertTrue(containsNearbyDuplicate(nums2, 3));
    }

}

