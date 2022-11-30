package com.wgp.middle;

import com.wgp.easy.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gangpeng.wgp
 * @date 2022/11/25 下午3:37
 */
public class M61_RotateRightTest {

    @Test
    public void rotateRight() {
        M61_RotateRight test = new M61_RotateRight();
        ListNode node = test.rotateRight(ListNode.getListNode(new int[]{1, 4, 5, 7}), 2);
        node.printListNode();

        node = test.rotateRight(ListNode.getListNode(new int[]{1, 4, 5, 7, 8}), 6);
        node.printListNode();
    }
}