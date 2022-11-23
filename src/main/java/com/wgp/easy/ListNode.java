package com.wgp.easy;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getListNode(int[] nums) {
        ListNode node = new ListNode(nums[0]);
        ListNode tempNode = node;
        for (int i = 1; i < nums.length; i++) {
            tempNode.next = new ListNode(nums[i]);
            tempNode = tempNode.next;
        }
        return node;
    }

    public void printListNode() {
        System.out.print(this.val);
        if (this.next != null) {
            this.next.printListNode();
        } else {
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "{" +
                "val=" + val +
                ", next=" + (next != null ? next.val : null) +
                '}';
    }
}