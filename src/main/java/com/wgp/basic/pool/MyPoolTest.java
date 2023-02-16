package com.wgp.basic.pool;

import java.util.concurrent.TimeUnit;

import com.mysql.jdbc.Connection;

public class MyPoolTest {
    /**
     * ����������ֶ�ʹ���Լ������ݿ����ӳػ�ȡ���ӣ�ִ�������ͷ����Ӳ�����
     * �����Ҫ��spring�����Զ���ȡ���ӣ�Ȼ��ִ����������������ͷ����ӣ���Ҫ��������ʵ��
     */
    public static void main(String[] args) {
        MyPool myPool = new MyPool(2);
        for (int i = 0; i < 5; i++) {
            int j = i;
            new Thread(() -> {
                Connection connection = myPool.borrow();
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                myPool.free(connection);
            }, "�߳�-" + j).start();
        }
    }
}
