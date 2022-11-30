package com.wgp.easy;

import java.util.Objects;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * 01.06. 字符串压缩
 * @author gangpeng.wgp
 * @date 2022/6/29 10:16 PM
 */
public class CompressString {

    public String compressString(String S) {
        if(S == null || S.length() == 0){
            return S;
        }
        StringBuilder sb = new StringBuilder();
        char lastChar = S.toCharArray()[0];
        int cnt = 0;
        for(int i=0; i<= S.length(); i ++){
            char c = i != S.length() ? S.charAt(i) : ' ' ;
            if(c != lastChar){
                sb.append(lastChar).append(cnt);
                cnt = 0;
            }
            lastChar = c;
            cnt += 1;
        }

        String newStr = sb.toString();
        if(newStr.length() < S.length()){
            return newStr;
        }
        return S;
    }

    @Test
    public void testCase() throws Exception {
        assertTrue(Objects.equals(new CompressString().compressString("aabcccccaa"), "a2b1c5a2"));
    }
}
