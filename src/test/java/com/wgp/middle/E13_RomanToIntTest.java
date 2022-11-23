package com.wgp.middle;

import com.wgp.easy.E13_RomanToInt;
import junit.framework.TestCase;

/**
 * @author gangpeng.wgp
 * @date 2022/11/22 下午2:30
 */
public class E13_RomanToIntTest extends TestCase {

    public void testIntToRoman() {
        E13_RomanToInt test = new E13_RomanToInt();
        assertEquals(test.romanToInt("III"), 3);
        assertEquals(test.romanToInt("IV"), 4);
        assertEquals( test.romanToInt("LVIII"), 58);

    }
}