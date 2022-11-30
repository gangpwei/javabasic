package com.wgp.easy.tree;

import org.junit.Test;
import util.TreeNode;

/**
  * ≈–∂œ2ø√ ˜ «∑Òœ‡Õ¨
  * @author gangpeng.wgp
  * @date 2022/5/30 10:21 PM
  */
public class E100_SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }


    @Test
    public void jia() throws Exception {

    }


}