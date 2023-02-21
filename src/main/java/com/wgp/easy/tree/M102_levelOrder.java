package com.wgp.easy.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;
import util.TreeNode;

/**
 * �������Ĳ������
 * @author : gangpeng.wgp
 * @date : 2022/11/16
 */
public class M102_levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //������ڵ㣬offer �� add ������offer �����쳣������false; add �����쳣
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int currentLevelSize = queue.size();

            //ÿһ��������ѵ�ǰ�ڵ��ֵ�ŵ������ٰ�2���ӽڵ�ŵ�������
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();

                //�ѵ�ǰ�ڵ��ֵ�ŵ��㼶��
                level.add(node.val);

                //�ѵ�ǰ�ڵ��2���ӽڵ�ŵ�������
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ret.add(level);
        }

        return ret;
    }

    @Test
    public void testProcess() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> list =  levelOrder(root);
        for (List<Integer> integers : list) {
            System.out.println(integers);
        }
    }
}
