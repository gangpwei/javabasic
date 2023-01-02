package com.wgp.easy.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * ÄûÃÊÕÒÁã
 * @author gangpeng.wgp
 * @date 2022/12/2 ÉÏÎç1:18
 */
public class LemonChange {
    /**
     * Ê¹ÓÃ¿ìÂıÖ¸Õë
     * @param nums
     * @return
     */
    public boolean change(int[] nums) {
        int five =0, ten = 0;
        for (int num: nums){
            if(num == 5){
                five++;
            }else if(num == 10){
                if(five > 0){
                    five--;
                }else{
                    return false;
                }
            }else if(num == 20){
                if(five > 0 && ten >0){
                    five--;
                    ten--;
                }else if(five >= 3){
                    five -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void testCase(){
        int[] array = new int[]{5, 5, 10};
        Assert.assertEquals(change(array), true);

        array = new int[]{5, 20, 10};
        Assert.assertEquals(change(array), false);

        array = new int[]{5, 10, 20};
        Assert.assertEquals(change(array), false);
    }

}
