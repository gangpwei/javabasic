package com.wgp.easy.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;
import util.TreeNode;

/**
 * 二叉树的层序遍历
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
        //插入根节点，offer 和 add 的区别：offer 不抛异常，返回false; add 会抛异常
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int currentLevelSize = queue.size();

            //每一层遍历，把当前节点的值放到结果里，再把2个子节点放到队列里
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();

                //把当前节点的值放到层级里
                level.add(node.val);

                //把当前节点的2个子节点放到队列里
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
