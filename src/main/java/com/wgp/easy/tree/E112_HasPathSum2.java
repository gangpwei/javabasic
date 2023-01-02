package com.wgp.easy.tree;

import util.TreeNode;

/**
 * @author gangpeng.wgp
 * @date 2022/12/1 ÏÂÎç9:00
 */
public class E112_HasPathSum2 {


    /**
     * µÝ¹é·¨
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

}
