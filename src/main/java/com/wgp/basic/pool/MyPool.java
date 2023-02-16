package com.wgp.basic.pool;

import java.util.concurrent.atomic.AtomicIntegerArray;

import com.mysql.jdbc.Connection;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyPool {
    /**
     * 连接池大小
     */
    private final int poolSize;
    /**
     * 连接对象数组
     */
    private Connection[] connections;
    /**
     * 连接状态数组，0表示空闲，1表示繁忙
     * 使用原子数组（AtomicIntegerArray）保证数组中的每个位置的元素操作的安全性
     */
    private AtomicIntegerArray states;

    /**
     * 构造方法初始化属性
     * 也可以使用init方法来进行创建连接
     */
    public MyPool(int poolSize) {
        this.poolSize = poolSize;
        connections = new Connection[poolSize];
        states = new AtomicIntegerArray(new int[poolSize]);
        // 创建连接并缓存起来
        for (int i = 0; i < poolSize; i++) {
            // 通过MySQL连接驱动去创建连接
            connections[i] = new MyConnection("连接--" + i);
        }
    }

    /**
     * 从连接池借连接
     */
    public Connection borrow() {
        while (true) {
            for (int i = 0; i < poolSize; i++) {
                // 期望states中第i个位置上的值为0，如果是则将他改成1，修改成功则返回true，反之则false
                if (states.compareAndSet(i, 0, 1)) {
                    log.debug("{} 线程获得数据库连接....", Thread.currentThread().getName());
                    return connections[i];
                }
            }
            // 当连接池中所有的连接都遍历完毕后还没有找到空闲的连接，则进入睡眠
            synchronized (this) {
                try {
                    // 注意：这里不能死等，如果长时间没有等到连接，那么这里可以带超时时间的等待
                    log.debug("暂时没有控线连接，等待.....");
                    // wait();
                    // 如果没有获取到连接则等待1s钟然后再次尝试获取
                    wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 归还连接给连接池
     */
    public void free(Connection connection) {
        for (int i = 0; i < poolSize; i++) {
            // 在连接池中找到对应的连接，然后将该连接的状态改为0，表示空闲
            if (connections[i] == connection) {
                log.info("{} 线程释放数据库连接.....", Thread.currentThread().getName());
                states.set(i, 0);
                // 唤醒其他正在等待连接的线程
                synchronized (this) {
                    notifyAll();
                }
                break;
            }
        }
    }

}

