package com.wgp.middle.listnode;

import com.wgp.easy.ListNode;
import org.junit.Test;

/**
 * 删除排序链表中的重复元素, 把出现>=2次的元素都删掉
 *
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
public class M82_deleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0, head);
        //注意：这里要从哑节点开始，否则第一个节点如果重复，没办法删除
        ListNode cur = dummy;

        while (cur.next != null && cur.next.next != null) {
            //如果当前节点的后面2个节点值相等
            if (cur.next.val == cur.next.next.val) {
                //记录重复值
                int x = cur.next.val;
                //如果下一个节点和重复值相等，删掉这个节点
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }

    @Test
    public void testCase() throws Exception {

        int[] nums1 = {1, 1, 2};
        ListNode node1 = ListNode.getListNode(nums1);
        node1.printListNode();

        ListNode result = null;
        //result = new E83_RemoveDuplicateNodes().removeDuplicateNodes(node1);
        //result.printListNode();

        int[] nums2 = {1,1,1,2,3};
        result = new M82_deleteDuplicates().deleteDuplicates(ListNode.getListNode(nums2));
        result.printListNode();
    }
}