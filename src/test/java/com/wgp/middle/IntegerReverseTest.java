package com.wgp.middle;

import com.wgp.middle.num.M07_IntegerReverse;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * @author gangpeng.wgp
 * @date 2022/11/22 下午12:41
 */
public class IntegerReverseTest extends TestCase {

    public void testLengthOfLongestSubstring() {
        M07_IntegerReverse test = new M07_IntegerReverse();
        //Assert.assertEquals(4321, test.reverse(1234));

        Assert.assertEquals(-123, test.reverse(-321));

        Assert.assertEquals(21, test.reverse(120));

        Assert.assertEquals(0, test.reverse(0));


    }
}