package com.wgp.easy.string;

import java.util.Arrays;

import org.junit.Test;

/**
 * 反转字符串
 * 头尾对调，循环次数根据长度奇偶判断
 * 注意：
 * 1、取余为%号
 * 2、奇数长度，总长度减一，再取除2
 * @author weigangpeng
 * @date 2018/01/21 上午11:24
 */

public class E344_reverseString {

    /**
     * 2数之和，哈希法
     * @return
     */
    public void reverseString(char[] s) {
        if(s.length == 0){
            return ;
        }
        int loopTimes = (s.length%2 == 0) ? s.length/2 : (s.length-1)/2 ;
        for(int i=0; i< loopTimes; i++){
            //保存倒数的值
            char temp = s[s.length - i-1];
            //倒数位置的值，赋值为顺数的值
            s[s.length - i -1] = s[i];
            //顺数位置的值，赋值为倒数位置的值
            s[i] = temp;
        }
    }



    @Test
    public void jia() throws Exception {


        char[] chars;
        //chars = new char[]{'h','e','l','l','o'};
        //new E344_reverseString().reverseString(chars);
        //System.out.println(Arrays.toString(chars));
        //
        //chars = new char[]{'H','a','n','n','a','h'};
        //new E344_reverseString().reverseString(chars);
        //System.out.println(Arrays.toString(chars));

        chars = new char[]{'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        new E344_reverseString().reverseString(chars);
        System.out.println(Arrays.toString(chars));

    }



}