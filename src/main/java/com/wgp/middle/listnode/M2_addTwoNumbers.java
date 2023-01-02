package com.wgp.middle.listnode;

import com.wgp.easy.ListNode;

/**
 * 两个链表相加
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
public class M2_addTwoNumbers {

    //给你两个?非空 的链表，表示两个非负的整数。它们每位数字都是按照?逆序?的方式存储的，并且每个节点只能存储?一位?数字。
    //
    //请你将两个数相加，并以相同形式返回一个表示和的链表。
    //
    //你可以假设除了数字 0 之外，这两个数都不会以 0?开头。


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(-1);
        ListNode head = current;
        
       int carray = 0;
        while(l1 != null || l2 != null ){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            
            int sum = val1 + val2 + carray;
            carray = sum/10;
            current.next = new ListNode(sum%10);

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            current = current.next;
        }
        if(carray > 0){
            current.next = new ListNode(carray);
        }
        return head.next;
    }
}