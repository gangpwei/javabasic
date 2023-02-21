package com.wgp.easy;

import java.util.HashMap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *  罗马数字转整数
 * @author : gangpeng.wgp
 * @date : 2022/11/22
 */
public class E13_RomanToInt {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int result = 0;
        if(s == null){
            return result;
        }
        //注意：需要考虑 组合的情况，例如：IV = 5
        //从字符串的尾部开始遍历，当前字符对应数字 < 上一个字符对应数字，则符号取负数
        int pre = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            int value = map.get(s.charAt(i));
            int flag = value < pre ? -1 : 1;
            result = result + value * flag;
            pre = value;
        }
        return result;
    }

    @Test
    public void testIntToRoman() {
        E13_RomanToInt test = new E13_RomanToInt();
        assertEquals(test.romanToInt("III"), 3);
        assertEquals(test.romanToInt("IV"), 4);
        assertEquals( test.romanToInt("LVIII"), 58);

    }
}