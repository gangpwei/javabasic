package com.wgp.basic.pool;

import java.util.concurrent.atomic.AtomicIntegerArray;

import com.mysql.jdbc.Connection;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyPool {
    /**
     * ���ӳش�С
     */
    private final int poolSize;
    /**
     * ���Ӷ�������
     */
    private Connection[] connections;
    /**
     * ����״̬���飬0��ʾ���У�1��ʾ��æ
     * ʹ��ԭ�����飨AtomicIntegerArray����֤�����е�ÿ��λ�õ�Ԫ�ز����İ�ȫ��
     */
    private AtomicIntegerArray states;

    /**
     * ���췽����ʼ������
     * Ҳ����ʹ��init���������д�������
     */
    public MyPool(int poolSize) {
        this.poolSize = poolSize;
        connections = new Connection[poolSize];
        states = new AtomicIntegerArray(new int[poolSize]);
        // �������Ӳ���������
        for (int i = 0; i < poolSize; i++) {
            // ͨ��MySQL��������ȥ��������
            connections[i] = new MyConnection("����--" + i);
        }
    }

    /**
     * �����ӳؽ�����
     */
    public Connection borrow() {
        while (true) {
            for (int i = 0; i < poolSize; i++) {
                // ����states�е�i��λ���ϵ�ֵΪ0������������ĳ�1���޸ĳɹ��򷵻�true����֮��false
                if (states.compareAndSet(i, 0, 1)) {
                    log.debug("{} �̻߳�����ݿ�����....", Thread.currentThread().getName());
                    return connections[i];
                }
            }
            // �����ӳ������е����Ӷ�������Ϻ�û���ҵ����е����ӣ������˯��
            synchronized (this) {
                try {
                    // ע�⣺���ﲻ�����ȣ������ʱ��û�еȵ����ӣ���ô������Դ���ʱʱ��ĵȴ�
                    log.debug("��ʱû�п������ӣ��ȴ�.....");
                    // wait();
                    // ���û�л�ȡ��������ȴ�1s��Ȼ���ٴγ��Ի�ȡ
                    wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * �黹���Ӹ����ӳ�
     */
    public void free(Connection connection) {
        for (int i = 0; i < poolSize; i++) {
            // �����ӳ����ҵ���Ӧ�����ӣ�Ȼ�󽫸����ӵ�״̬��Ϊ0����ʾ����
            if (connections[i] == connection) {
                log.info("{} �߳��ͷ����ݿ�����.....", Thread.currentThread().getName());
                states.set(i, 0);
                // �����������ڵȴ����ӵ��߳�
                synchronized (this) {
                    notifyAll();
                }
                break;
            }
        }
    }

}

