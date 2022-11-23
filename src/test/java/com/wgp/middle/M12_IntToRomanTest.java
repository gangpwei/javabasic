package com.wgp.middle;

import junit.framework.TestCase;

/**
 * @author gangpeng.wgp
 * @date 2022/11/22 下午2:30
 */
public class M12_IntToRomanTest extends TestCase {

    public void testIntToRoman() {
        M12_RomanToInt test = new M12_RomanToInt();
        assertEquals(test.intToRoman(3), "III");
        assertEquals(test.intToRoman(4), "IV");
        assertEquals(test.intToRoman(58), "LVIII");

    }
}