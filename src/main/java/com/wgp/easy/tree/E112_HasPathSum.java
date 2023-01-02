package com.wgp.easy.tree;

import java.util.Deque;
import java.util.LinkedList;

import util.TreeNode;

/**
 * @author gangpeng.wgp
 * @date 2022/12/1 ����9:00
 */
public class E112_HasPathSum {

    /**
     * �������
     *
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

        //2������һһ��Ӧ��һ����ڵ㣬һ����ڵ��Ӧ���ۼӺ�
        Deque<TreeNode> queNode = new LinkedList<>();
        Deque<Integer> queVal = new LinkedList<>();
        queNode.offer(root);
        queVal.offer(root.val);
        while (!queNode.isEmpty()){
            //��ǰ�ڵ�
            TreeNode now = queNode.poll();
            //��ǰ�ڵ��Ӧ���ۼӺ�
            int temp = queVal.poll();
            if(now.left == null && now.right == null){
                if(temp == sum){
                    return true;
                }
                continue;
            }
            if(now.left != null){
                queNode.offer(now.left);
                queVal.offer(now.left.val + temp);
            }

            if(now.right != null){
                queNode.offer(now.right);
                queVal.offer(now.right.val + temp);
            }
        }
        return false;
    }

}
