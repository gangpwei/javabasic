package com.wgp.easy.string;

/**
 * 最长回文串
 * @author gangpeng.wgp
 * @date 2022/11/30 下午10:46
 */
public class E409_longestPalindrome {

    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c]++;
        }

        int ans = 0;
        for (int v: count) {
            //取当前字符数量里面最大的偶数值
            ans += v/2 * 2;

            //如果当前字符个数为奇数，且结果串为偶数
            if(v % 2 == 1 && ans % 2 == 0 ){
                ans ++;
            }
        }

        return ans;
    }
}
