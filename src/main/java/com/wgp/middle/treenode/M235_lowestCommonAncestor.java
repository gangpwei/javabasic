package com.wgp.middle.treenode;

import util.TreeNode;

/**
 * �����������������������
 *
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
public class M235_lowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pv = p.val;
        int qv = q.val;
        while (root != null) {
            //��һ�����͸��ڵ���ȣ��򹫹��ڵ��Ǹ��ڵ�
            if (pv == root.val) {
                return p;
            } else if (qv == root.val) {
                return q;
            }
            //2���ڸ��ڵ�2�ߣ��򹫹��ڵ��Ǹ��ڵ�
            else if ((pv < root.val && root.val < qv) || (qv < root.val && root.val < pv)) {
                return root;
            }
            //2���ڸ��ڵ���ߣ��򹫹��ڵ��Ǹ��ڵ����ڵ�
            else if (root.val > pv && root.val > qv) {
                root = root.left;
            }
            //2���ڸ��ڵ���ߣ��򹫹��ڵ��Ǹ��ڵ���ҽڵ�
            else {
                root = root.right;
            }
        }
        return null;
    }

}