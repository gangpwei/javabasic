package com.wgp.easy.num;

public class E66_plusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        //从最后一位加1，如果没有进位直接返回
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }

        //如果全部都是9，创建一个新的数组，第一位是1，其他都是0
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}