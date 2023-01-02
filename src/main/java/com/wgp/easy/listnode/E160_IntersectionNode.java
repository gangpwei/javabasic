package com.wgp.easy.listnode;

import com.wgp.easy.ListNode;

/**
 * 求2个相交链表的相交的起始位置
 * @author : gangpeng.wgp
 * @date : 2022/11/30
 */
public class E160_IntersectionNode {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA != pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;


    }

}