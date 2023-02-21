package com.wgp.middle.listnode;

import com.wgp.easy.ListNode;
import org.junit.Test;

/**
 * 排序链表
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 *
 * @author gangpeng.wgp
 * @date 2022/11/29 下午10:10
 */
public class M148_SortList {

    //时间复杂度：O(nlogn)，其中 n 是链表的长度。
    //
    //空间复杂度：O(logn)，其中 n 是链表的长度。空间复杂度主要取决于递归调用的栈空间。

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        //第一步，得到链表的中间节点，通过快慢指针法
        ListNode mid = getMiddleListNode(head);

        //注意：分为2段后，要从中间把链表断开
        ListNode head2 = mid.next;
        mid.next = null;

        //第二步，分别对链表的2段排序
        ListNode list1 = sortList(head);

        ListNode list2 = sortList(head2);

        //第三步，合并2个链表
        return mergeTwoLists(list1, list2);
    }

    /**
     * 获取链表中间位置
     *
     * @param head
     * @return
     */
    private ListNode getMiddleListNode(ListNode head) {
        //注意，快指针初始值要比慢指针快一步
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * 合并2个有序链表
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            //注意 结果的指针也要向后移动
            p = p.next;
        }
        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        p.next = l1 != null ? l1 : l2;
        return result.next;
    }

    @Test
    public void testCase() {
        int[] nums1 = {4, 2, 1, 3};
        ListNode listNode = this.sortList(ListNode.getListNode(nums1));
        listNode.printListNode();
    }
}
