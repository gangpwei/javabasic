package com.wgp.easy;

/**
 * @author gangpeng.wgp
 * @date 2022/12/2 ����12:20
 */
public class E_IsPalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        //�����ַ�תһ�룬���ж��Ƿ��ʣ�µ�һ�����
        int revertNum = 0 ;
        //��תһ���������ʣ�µ�һ��Ҫ���Ѿ���ת�Ĵ�
        while(x > revertNum){
            revertNum = revertNum * 10 + x % 10;
            x = x / 10;
        }
        return x == revertNum || x == revertNum / 10;
    }
}
