package com.wgp.middle;

/**
 * 最小栈
 *
 * @author gangpeng.wgp
 * @date 2022/11/22 下午8:40
 */

/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * <p>
 * 实现 MinStack 类:
 * <p>
 * MinStack() 初始化堆栈对象。
 * void push(int val) 将元素val推入堆栈。
 * void pop() 删除堆栈顶部的元素。
 * int top() 获取堆栈顶部的元素。
 * int getMin() 获取堆栈中的最小元素。
 **/

public class M155_MinStack {
    //栈顶节点
    private Node top;

    public M155_MinStack() {

    }

    public void push(int val) {
        if (top == null) {
            top = new Node(val, val, null);
        } else {
            top = new Node(val, Math.min(top.min, val), top);
        }
    }

    public void pop() {
        top = top.next;
    }

    public int top() {
        return top.value;
    }

    public int getMin() {
        return top.min;
    }

    public static class Node {
        private int value;
        private int min;
        private Node next;

        public Node(int value, int min, Node next) {
            this.value = value;
            this.min = min;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
