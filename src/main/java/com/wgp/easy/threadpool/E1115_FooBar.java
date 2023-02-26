package com.wgp.easy.threadpool;

import java.util.concurrent.Semaphore;

/**
 * 交替打印 FooBar N次
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
            //抢foo坑位，能拿到，执行下面的操作；foo坑位只有一个，下次进来就需要排队
            fooSema.acquire();
            printFoo.run();
            //bar坑位空出一个，给bar方法执行提供先机
            barSema.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            barSema.acquire();//值为1的时候，能拿到，执行下面的操作
            printBar.run();
            fooSema.release();//释放许可给fooSema这个信号量 fooSema 的值+1
        }
    }
}

