package com.wgp.easy.num;

public class E66_plusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        //�����һλ��1�����û�н�λֱ�ӷ���
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }

        //���ȫ������9������һ���µ����飬��һλ��1����������0
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}