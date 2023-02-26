package com.wgp.easy.threadpool;

import java.util.concurrent.TimeUnit;

/**
 * 用synchronized实现lock unlock
 *
 * @author gangpeng.wgp
 * @date 2022/11/18 11:36 上午
 */
public class Lock {

    //当没有任何线程持有锁时锁的线程ID
    private static final long NONE = -1;

    //区分锁的持有者线程的标志
    private static long owner = NONE;

    //锁的状态,使锁具有可重入性
    private static int state;

    //记录上一次持有锁的线程ID,使锁具有可重入性,
    // 1.确保线程在重入后解锁的次数和重入次数相同,清空锁的拥有者下次不报异常,
    // 2.记录上次线程ID, 在锁状态位大于0并且当前线程和上次线程不一致时当前线程要等待, 避免锁了10次解锁2次其他线程就进来了
    private static long lastThreadId;

    public synchronized void lock() {
        long currentThreadId = Thread.currentThread().getId();
        //如果锁被占用，且不是当前线程，当前线程挂起
        while ((owner != NONE && currentThreadId != owner) || (state > 0 && lastThreadId != currentThreadId)) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        owner = currentThreadId;
        lastThreadId = currentThreadId;
        state += 1;
    }

    public synchronized void unlock() {
        long currentThreadId = Thread.currentThread().getId();

        //如果锁不是当前线程持有，抛异常
        if ((owner != currentThreadId && lastThreadId != currentThreadId) || --state < 0) {
            if (state < 0) {
                state = 0;
            }
            throw new IllegalThreadStateException();
        }
        owner = NONE;
        lastThreadId = currentThreadId;
        this.notifyAll();
    }

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new Lock();
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                lock.lock();
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(Thread.currentThread().getName() + "执行");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }).start();
        }

        TimeUnit.HOURS.sleep(1);

    }

}
