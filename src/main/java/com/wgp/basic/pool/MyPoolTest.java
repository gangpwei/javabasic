package com.wgp.basic.pool;

import java.util.concurrent.TimeUnit;

import com.mysql.jdbc.Connection;

public class MyPoolTest {
    /**
     * 这里仅测试手动使用自己的数据库连接池获取连接，执行任务，释放连接操作。
     * 如果想要像spring那样自动获取连接，然后执行任务，任务结束后释放连接，需要用切面来实现
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
            }, "线程-" + j).start();
        }
    }
}
