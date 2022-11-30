package com.wgp.easy.tree;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

/**
 * 判断它是否是高度平衡的二叉树
 * @author gangpeng.wgp
 * @date 2022/5/30 10:21 PM
 */
public class E110_BalanceTree {

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        return isBalanced(root.left) && isBalanced(root.right) && (Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1);
    }

    private int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


   @Test
   public void testProcess() throws Exception {
       TreeNode root = new TreeNode(1);
       root.right = new TreeNode(2);
       root.right.right = new TreeNode(3);
       root.right.right.right = new TreeNode(4);
       root.left = new TreeNode(2);
       root.left.left = new TreeNode(3);
       root.left.left.left = new TreeNode(4);

       Assert.assertTrue(isBalanced(root));
   }


}