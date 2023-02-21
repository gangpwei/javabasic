package com.wgp.easy;

/**
 * @author gangpeng.wgp
 * @date 2022/12/2 上午12:20
 */
public class E_IsPalindromeNumber {
    public boolean isPalindrome(int x) {
        //小于0，或者0结尾的，直接返回
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        //把数字反转一半，再判断是否和剩下的一半相等
        int revertNum = 0;
        //反转一半的条件，剩下的一半要比已经反转的大
        while (x > revertNum) {
            revertNum = revertNum * 10 + x % 10;
            x = x / 10;
        }
        return x == revertNum || x == revertNum / 10;
    }
}
