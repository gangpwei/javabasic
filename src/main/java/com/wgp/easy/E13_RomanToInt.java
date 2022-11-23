package com.wgp.easy;

import java.util.HashMap;

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
        int pre = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            int value = map.get(s.charAt(i));
            int flag = value < pre ? -1 : 1;
            result = result + value * flag;
            pre = value;
        }
        return result;
    }
}