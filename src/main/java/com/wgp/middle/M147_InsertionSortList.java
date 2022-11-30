package com.wgp.middle;

import com.wgp.easy.ListNode;

/**
 * 对链表进行插入排序
 *
 * @author gangpeng.wgp
 * @date 2022/11/29 下午11:05
 */
public class M147_InsertionSortList {


    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        //已排好序的尾部节点
        ListNode lastSorted = head;

        //待排序节点
        ListNode curr = head.next;
        while (curr != null) {
            //如果待排序节点，比上次排好序的最大值还大，当前节点和待排序节点同时往后移动一位
            if (lastSorted.val <= curr.val) {
                lastSorted = lastSorted.next;
            } else {
                ListNode prev = dummyHead;
                //否则从头开始遍历，逐个比对
                while (prev.next.val <= curr.val) {
                    prev = prev.next;
                }
                lastSorted.next = curr.next;
                curr.next = prev.next;
                prev.next = curr;
            }
            curr = lastSorted.next;
        }
        return dummyHead.next;
    }
}
