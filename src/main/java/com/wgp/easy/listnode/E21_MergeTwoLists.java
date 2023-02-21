package com.wgp.easy.listnode;

import com.wgp.easy.ListNode;
import org.junit.Test;

/**
 * 合并2个升序链表
 *
 * @author gangpeng.wgp
 * @date 2022/11/22 下午5:58
 */
public class E21_MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }

    @Test
    public void testCase() throws Exception {
        int[] nums1 = {1, 3, 4, 5};
        ListNode node1 = ListNode.getListNode(nums1);
        node1.printListNode();

        int[] nums2 = {2, 3, 4, 6};
        ListNode node2 = ListNode.getListNode(nums2);
        node2.printListNode();

        ListNode node3 = mergeTwoLists(node1, node2);
        node3.printListNode();
    }

}
