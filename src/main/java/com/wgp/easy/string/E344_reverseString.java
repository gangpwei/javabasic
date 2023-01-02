package com.wgp.easy.string;

import java.util.Arrays;

import org.junit.Test;

/**
 * ��ת�ַ���
 * ͷβ�Ե���ѭ���������ݳ�����ż�ж�
 * ע�⣺
 * 1��ȡ��Ϊ%��
 * 2���������ȣ��ܳ��ȼ�һ����ȡ��2
 * @author weigangpeng
 * @date 2018/01/21 ����11:24
 */

public class E344_reverseString {

    /**
     * 2��֮�ͣ���ϣ��
     * @return
     */
    public void reverseString(char[] s) {
        if(s.length == 0){
            return ;
        }
        int loopTimes = (s.length%2 == 0) ? s.length/2 : (s.length-1)/2 ;
        for(int i=0; i< loopTimes; i++){
            //���浹����ֵ
            char temp = s[s.length - i-1];
            //����λ�õ�ֵ����ֵΪ˳����ֵ
            s[s.length - i -1] = s[i];
            //˳��λ�õ�ֵ����ֵΪ����λ�õ�ֵ
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