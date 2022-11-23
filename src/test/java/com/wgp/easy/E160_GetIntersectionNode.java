package com.wgp.easy;

/**
 * @author gangpeng.wgp
 * @date 2022/11/23 上午9:08
 */
public class E160_GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        ListNode indexA = headA;
        ListNode indexB = headB;
        while (indexA != indexB){
            indexA = indexA.next != null ? indexA.next : headB;
            indexB = indexB.next != null ? indexB.next : headA;
        }
        return indexA;
    }

    //public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //    if (headA == null || headB == null) {
    //        return null;
    //    }
    //    ListNode pA = headA, pB = headB;
    //    while (pA != pB) {
    //        pA = pA == null ? headB : pA.next;
    //        pB = pB == null ? headA : pB.next;
    //    }
    //    return pA;
    //}


}
