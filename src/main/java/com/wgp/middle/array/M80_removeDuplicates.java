package com.wgp.middle.array;

/**
 * ɾ�����������е��ظ��ʹ��ÿ�������ֵĴ���������2��
 * @author gangpeng.wgp
 * @date 2022/12/2 ����1:18
 */
public class M80_removeDuplicates {
    /**
     * ʹ�ÿ���ָ��
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }

        int slow = 1;
        //��¼��ͬ�����ִ���
        int sameCnt = 1;
        for(int i=1; i< nums.length; i++){
            if(nums[i] != nums[i -1]){
                sameCnt = 1;
                nums[slow] = nums[i];
                slow++;
            }
            else if(sameCnt < 2){
                sameCnt ++;
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }

}
