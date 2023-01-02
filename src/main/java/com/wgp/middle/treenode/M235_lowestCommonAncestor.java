package com.wgp.middle.treenode;

import util.TreeNode;

/**
 * 二叉搜索树的最近公共祖先
 *
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
public class M235_lowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pv = p.val;
        int qv = q.val;
        while (root != null) {
            //有一个数和根节点相等，则公共节点是根节点
            if (pv == root.val) {
                return p;
            } else if (qv == root.val) {
                return q;
            }
            //2数在根节点2边，则公共节点是根节点
            else if ((pv < root.val && root.val < qv) || (qv < root.val && root.val < pv)) {
                return root;
            }
            //2数在根节点左边，则公共节点是根节点的左节点
            else if (root.val > pv && root.val > qv) {
                root = root.left;
            }
            //2数在根节点左边，则公共节点是根节点的右节点
            else {
                root = root.right;
            }
        }
        return null;
    }

}