package com.wgp.basic.queue;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
 
/**
 * @author: MXD
 * @date: 2021/8/12 17:10
 * @description: ʵ�ּ򵥵���������
 */
public class MyBlockingQueue<E> {
    /**
     * ���������������
     */
    private int size;
 
    /**
     * ���еײ�ʵ��
     */
    LinkedList<E> list = new LinkedList<>();
 
    ReentrantLock lock = new ReentrantLock();
 
    /**
     * �������ĵȴ�����
     */
    Condition full = lock.newCondition();
 
    /**
     * ���пյĵȴ�����
     */
    Condition empty = lock.newCondition();
 
    public MyBlockingQueue(int size) {
        this.size = size;
    }
 
 
    public void enqueue(E e) throws InterruptedException {
        lock.lock();
        try {
            // �������ˣ�����full�����Ͻ��еȴ�
            while (list.size() == size){
                full.await();
            }
 
            list.add(e);
            System.out.println("��ӣ�"+e);
            // ���֮�󣬾�֪ͨ��empty�����µȴ����߳�
            empty.signal();
        } finally {
            lock.unlock();
        }
    }
 
    public E dequeue() throws InterruptedException {
        E e;
        lock.lock();
        try {
            // ����Ϊ�գ����ڿ������ϵȴ�
            while (list.size() == 0){
                empty.await();
            }
            e = list.removeFirst();
            System.out.println("���ӣ�"+e);
            // ����֮�󣬾�֪ͨ��full�����µȴ����߳�
            full.signal();
            return e;
        } finally {
            lock.unlock();
        }
    }
}