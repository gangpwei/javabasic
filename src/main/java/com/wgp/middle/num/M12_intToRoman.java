package com.wgp.middle.num;

import org.junit.Test;

/**
 * 整数转罗马数字
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
public class M12_intToRoman {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    /**
     * 解题思路
     * 1、构造2个数组，分别存放int数和罗马数，顺序从大到小
     * 2、遍历int数组，如果num大于int数，用num减当前值int数，同时添加对应罗马数到结果尾部
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; ++i) {
            int value = values[i];
            String symbol = symbols[i];
            while (num >= value) {
                num -= value;
                roman.append(symbol);
            }
            if (num == 0) {
                break;
            }
        }
        return roman.toString();
    }

    @Test
    public void testCase() throws Exception {
        String s = intToRoman(2911);
        System.out.println(s);
    }
}