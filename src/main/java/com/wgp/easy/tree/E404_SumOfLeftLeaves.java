package com.wgp.easy.tree;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

/**
 * 判断它是否是高度平衡的二叉树
 * @author gangpeng.wgp
 * @date 2022/5/30 10:21 PM
 */
public class E404_SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        int value = ((root.left != null && root.left.left == null && root.left.right == null) ? root.left.val : 0);
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + value;
    }

    @Test
    public void testProcess() throws Exception {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = new easy.tree.E404_SumOfLeftLeaves().sumOfLeftLeaves(root);
        Assert.assertEquals(24, result);
    }

}

