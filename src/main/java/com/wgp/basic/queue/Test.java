package com.wgp.basic.queue;
 
/**
 * @author: MXD
 * @date: 2021/8/12 17:28
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        final MyBlockingQueue<Integer> blockingQueue = new MyBlockingQueue<Integer>(2);
        for (int i = 0; i < 5; i++) {
            final int data = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        blockingQueue.enqueue(data);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        blockingQueue.dequeue();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}