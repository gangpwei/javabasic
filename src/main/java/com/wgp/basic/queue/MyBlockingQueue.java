package com.wgp.basic.queue;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
 
/**
 * @author: MXD
 * @date: 2021/8/12 17:10
 * @description: 实现简单的阻塞队列
 */
public class MyBlockingQueue<E> {
    /**
     * 阻塞队列最大容量
     */
    private int size;
 
    /**
     * 队列底层实现
     */
    LinkedList<E> list = new LinkedList<>();
 
    ReentrantLock lock = new ReentrantLock();
 
    /**
     * 队列满的等待条件
     */
    Condition full = lock.newCondition();
 
    /**
     * 队列空的等待条件
     */
    Condition empty = lock.newCondition();
 
    public MyBlockingQueue(int size) {
        this.size = size;
    }
 
 
    public void enqueue(E e) throws InterruptedException {
        lock.lock();
        try {
            // 队列满了，就在full条件上进行等待
            while (list.size() == size){
                full.await();
            }
 
            list.add(e);
            System.out.println("入队："+e);
            // 入队之后，就通知在empty条件下等待的线程
            empty.signal();
        } finally {
            lock.unlock();
        }
    }
 
    public E dequeue() throws InterruptedException {
        E e;
        lock.lock();
        try {
            // 队列为空，就在空条件上等待
            while (list.size() == 0){
                empty.await();
            }
            e = list.removeFirst();
            System.out.println("出队："+e);
            // 出队之后，就通知在full条件下等待的线程
            full.signal();
            return e;
        } finally {
            lock.unlock();
        }
    }
}