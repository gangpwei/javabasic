package com.wgp.middle.array;

/**
 * 删除有序数组中的重复项，使得每个数出现的次数不超过2个
 * @author gangpeng.wgp
 * @date 2022/12/2 上午1:18
 */
public class M80_removeDuplicates {
    /**
     * 使用快慢指针
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }

        int slow = 1;
        //记录相同数出现次数
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
