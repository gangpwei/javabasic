package com.wgp.middle;

import com.wgp.middle.num.M16_ThreeSumClosest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gangpeng.wgp
 * @date 2022/11/25 上午11:58
 */
public class M16_ThreeSumClosestTest {

    @Test
    public void threeSumClosest() {
        M16_ThreeSumClosest test = new M16_ThreeSumClosest();
        int[] array = new int[]{-1,2,1,-4};
        int target = 1;
        int result = 0;

        //test.threeSumClosest(array, target);
        //assertEquals(result, 1);

        //array = new int[]{1,2,3,4,6};
        //target = 8;
        //result =  test.threeSumClosest(array, target);
        //assertEquals(result, 9);

        array = new int[]{4,0,5,-5,3,3,0,-4,-5};
        target = -2;
        result =  test.threeSumClosest(array, target);
        assertEquals(result, -2);
    }
}