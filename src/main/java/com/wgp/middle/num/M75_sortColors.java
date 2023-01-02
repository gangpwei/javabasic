package com.wgp.middle.num;

/**
 * ��ɫ����
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
class M75_sortColors {

    //����һ��������ɫ����ɫ����ɫ����?n ��Ԫ�ص�����?nums?��ԭ�ض����ǽ�������ʹ����ͬ��ɫ��Ԫ�����ڣ������պ�ɫ����ɫ����ɫ˳�����С�
    //
    //����ʹ������ 0��?1 �� 2 �ֱ��ʾ��ɫ����ɫ����ɫ��

    /**
     *
     * @param nums
     */
    public void sortColors(int[] nums) {
        int n = nums.length;
        int ptr = 0;
        //��0�Ƶ���ǰ��
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) {
                ptr = swap(nums, ptr, i);
            }
        }

        //��1�Ƶ�o�ĺ���
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