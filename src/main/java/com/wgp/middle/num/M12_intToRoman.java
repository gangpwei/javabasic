package com.wgp.middle.num;

import org.junit.Test;

/**
 * ����ת��������
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
public class M12_intToRoman {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    /**
     * ����˼·
     * 1������2�����飬�ֱ���int������������˳��Ӵ�С
     * 2������int���飬���num����int������num����ǰֵint����ͬʱ��Ӷ�Ӧ�����������β��
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