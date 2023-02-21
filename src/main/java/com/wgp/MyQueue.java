package com.wgp;

import java.util.Stack;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 用栈实现队列，要求线程安全
 * @author gangpeng.wgp
 * @date 2022/11/22 上午9:17
 */
public class MyQueue<E> {

    //入栈
    private Stack<E> inStack = new Stack<E>();

    //出栈
    private Stack<E> outStack = new Stack<E>();

    //锁
    private ReentrantLock lock = new ReentrantLock();

    /**
     * 入队列
     * @param obj
     */
    public void offer(E obj) {
        lock.lock();
        try {
            System.out.println("入队列：" + obj);

            //入栈之前，把出栈队列的元素还原回来
            while (!outStack.empty()) {
                inStack.push(outStack.pop());
            }

            //把新的元素入栈
            inStack.push(obj);
        } finally {
            lock.unlock();
        }
    }

    /**
     * 出队列
     * @return
     */
    public E poll() {
        lock.lock();
        try {
            //出栈前，把入栈元素倒排放到出栈
            while (!inStack.empty()) {
                outStack.push(inStack.pop());
            }

            E obj = outStack.pop();
            System.out.println("   出队列：" + obj);
            return obj;
        } finally {
            lock.unlock();
        }
    }

    /**
     * 队列是否为空
     * @return 队列是否为空
     */
    public boolean isEmpty() {
        return outStack.isEmpty() && inStack.isEmpty();
    }
}
