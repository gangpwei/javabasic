package com.wgp.middle;

/**
 * 整数翻转
 * @author gangpeng.wgp
 * @date 2022/11/22 下午12:39
 */
public class M07_IntegerReverse {

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev;
    }

}
