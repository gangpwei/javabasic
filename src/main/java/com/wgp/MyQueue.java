package com.wgp;

import java.util.Stack;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author gangpeng.wgp
 * @date 2022/11/22 上午9:17
 */
public class MyQueue {

    private Stack<Object> stackA = new Stack<Object>();

    private Stack<Object> stackB = new Stack<Object>();

    private ReentrantLock lock = new ReentrantLock();

    public void add(Object obj) {
        try {
            lock.lock();
            stackA.push(obj);
            while (!stackA.empty()){
                stackB.push(stackA.pop());
            }
        } finally {
            lock.lock();
        }
    }

    public Object offer(){
        try {
            lock.lock();
            return stackB.pop();
        } finally {
            lock.unlock();
        }
    }

    public int size(){
        return stackB.size();
    }
}
