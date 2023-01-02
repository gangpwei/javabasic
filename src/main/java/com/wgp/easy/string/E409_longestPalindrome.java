package com.wgp.easy.string;

/**
 * ����Ĵ�
 * @author gangpeng.wgp
 * @date 2022/11/30 ����10:46
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
            //ȡ��ǰ�ַ�������������ż��ֵ
            ans += v/2 * 2;

            //�����ǰ�ַ�����Ϊ�������ҽ����Ϊż��
            if(v % 2 == 1 && ans % 2 == 0 ){
                ans ++;
            }
        }

        return ans;
    }
}
