package com.wgp.easy.num;

import org.junit.Assert;
import org.junit.Test;

/**
 * �жϸ�����Χ���ж��ٸ�����
 * @author gangpeng.wgp
 * @date 2023/1/1 ����12:01
 */
public class Sushu {

    public int suShuCount(int x){
        int cnt = 0;
        boolean[] isHeShu = new boolean[x];
        for (int i = 2; i < x; i++) {
            if(!isHeShu[i]){
                cnt ++;
                //j�� i*i ��ʼ������С�� i*i����֮ǰ��ѭ�����Լ�������
                for (int j = i * i; j < x; j += i) {
                    System.out.println(j);
                    isHeShu[j] = true;
                }
            }
        }
        return cnt;
    }

    @Test
    public void testCase(){
        Assert.assertEquals(suShuCount(100), 25);
    }
}
