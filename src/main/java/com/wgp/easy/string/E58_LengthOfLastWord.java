package com.wgp.easy.string;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * ���һ�����ʵĳ���
 * @author gangpeng.wgp
 * @date 2022/12/3 ����4:24
 */
public class E58_LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(" ") - 1;
    }

    @Test
    public void testLengthOfLastWord(){
        int result = new E58_LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  ");
        assertTrue(result == 4);
    }
}
