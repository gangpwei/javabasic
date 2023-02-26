package com.wgp.easy.threadpool;

import java.util.concurrent.Semaphore;

/**
 * �����ӡ FooBar N��
 */
public class E1115_FooBar {
    private int n;

    private Semaphore fooSema = new Semaphore(1);
    private Semaphore barSema = new Semaphore(0);

    public E1115_FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            //��foo��λ�����õ���ִ������Ĳ�����foo��λֻ��һ�����´ν�������Ҫ�Ŷ�
            fooSema.acquire();
            printFoo.run();
            //bar��λ�ճ�һ������bar����ִ���ṩ�Ȼ�
            barSema.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            barSema.acquire();//ֵΪ1��ʱ�����õ���ִ������Ĳ���
            printBar.run();
            fooSema.release();//�ͷ���ɸ�fooSema����ź��� fooSema ��ֵ+1
        }
    }
}

