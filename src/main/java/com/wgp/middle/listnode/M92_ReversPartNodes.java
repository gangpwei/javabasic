package com.wgp.middle.listnode;

import com.wgp.easy.ListNode;
import org.junit.Test;

/**
 * 反转链表
 *
 * @author : gangpeng.wgp
 * @date : 2022/12/3
 */
public class M92_ReversPartNodes {
    //给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。

    /**
     * 穿针引线
     * 把中间链表截取出来，反转，再和2头拼起来
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode pre = dummyNode;
        // 第 1 步：从虚拟头节点走 left - 1 步，来到 left 节点的前一个节点
        // 建议写在 for 循环里，语义清晰
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        // 第 2 步：从 pre 再走 right - left + 1 步，来到 right 节点
        ListNode rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }

        // 第 3 步：切断出一个子链表（截取链表）
        ListNode leftNode = pre.next;
        ListNode curr = rightNode.next;

        // 注意：切断链接
        pre.next = null;
        rightNode.next = null;

        // 第 4 步：同第 206 题，反转链表的子区间
        reverseLinkedList(leftNode);

        // 第 5 步：接回到原来的链表中
        pre.next = rightNode;
        //注意：因为链表是反转的，这里取leftNode 而不是rightNode
        leftNode.next = curr;
        return dummyNode.next;
    }

    public ListNode reverseLinkedList(ListNode head) {
        //注意：这里不能用哑节点
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            //注意：上一个指针和当前指针同时后移
            pre = head;
            head = next;
        }
        return pre;
    }

    @Test
    public void testCase() throws Exception {

        int[] nums1 = {1, 2, 3, 4, 5};
        ListNode node1 = ListNode.getListNode(nums1);
        node1.printListNode();

        ListNode result = new M92_ReversPartNodes().reverseBetween(node1, 2, 4);
        result.printListNode();

    }
}