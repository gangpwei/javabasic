package com.wgp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author gangpeng.wgp
 * @date 2022/11/22 上午10:29
 */
public class MyQueueTest  {

    @Test
    public void testPoll() {
        final MyQueue<String> queue = new MyQueue();

        List<Callable> taskList = new ArrayList<Callable>();


        taskList.add(new Callable() {
            @Override
            public Object call() {
                for (int i = 1; i <= 5; i++) {
                    queue.offer("A" + i);
                    sleep(200);
                }
                return null;
            }
        });

        taskList.add(new Callable() {
            @Override
            public Object call() {
                for (int i = 1; i <= 5; i++) {
                    queue.offer("B" + i);
                    sleep(100);
                }
                return null;
            }
        });

        taskList.add(new Callable() {
            @Override
            public Object call() {
                for (int i = 1; i <= 2; i++) {
                    queue.poll();
                    sleep(400);
                }
                return null;
            }
        });


        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future> futures = new ArrayList<Future>();
        for (Callable callable : taskList) {
            Future future = executorService.submit(callable);
            futures.add(future);
        }

        for (Future future : futures) {
            try {
                future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }


        //System.out.println("====队列元素");
        while(!queue.isEmpty()) {
            queue.poll();
        }

    }

    private void sleep(int value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}