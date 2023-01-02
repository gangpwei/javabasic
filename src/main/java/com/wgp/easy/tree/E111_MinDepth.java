package com.wgp.easy.tree;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

/**
 * �����������С���
 * @author gangpeng.wgp
 * @date 2023/1/1 ����8:14
 */
public class E111_MinDepth {

    /**
     * �������
     * @param root
     * @return
     */
    public int minDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //ע�⣺����ֱ��ȡ2���ӽڵ����С��ȡ����һ���ӽڵ�Ϊ�գ��迴����һ���ڵ�����
        int leftDepth = minDepth1(root.left);
        int rightDepth = minDepth1(root.right);
        if(leftDepth == 0 && rightDepth == 0){
            return 1;
        }else if(leftDepth == 0 || rightDepth == 0){
            return Math.max(leftDepth, rightDepth) + 1;
        }
        return Math.min(leftDepth, rightDepth) + 1;
    }

    /**
     * �������
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                //��û��Ҷ�ӽڵ㣬�������
                if(node.right == null && node.left == null){
                    return depth;
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        return 0;
    }

    @Test
    public void testProcess() throws Exception {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        //root.left.left.left = new TreeNode(4);

        Assert.assertTrue(minDepth(root) == 3);
    }
}
