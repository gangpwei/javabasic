package com.wgp.easy.string;

import java.util.Stack;

import org.junit.Test;

/**
 * 字符串按单词倒序输出
 * @author gangpeng.wgp
 * @date 2023/1/11 下午10:01
 */
public class ReverseWords {


    public String reverse(String str){
        Stack<String> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        int lastIndex = 0;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if(!(c >='a' && c <= 'z' || c >='A' && c <= 'Z')){
                String temp = str.substring(lastIndex == 0 ? 0 : lastIndex + 1, i);
                stack.push(temp);
                stack.push(String.valueOf(c));
                lastIndex = i;
            }
        }
        String sb = "";
        while (!stack.isEmpty()){
            sb += stack.pop();
        }
        return sb;
    }

    @Test
    public void testCase(){
        System.out.println(reverse("hi,hello world!"));
    }
}
