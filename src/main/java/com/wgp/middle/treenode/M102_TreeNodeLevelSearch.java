package com.wgp.middle.treenode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import util.TreeNode;

/**
 * �������Ĳ������
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
class M102_TreeNodeLevelSearch {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null){
            return result;
        }
        
        LinkedList<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> levelList = new ArrayList<Integer>();
            //ע�⣬����ά����һ����ǰ��ڵ������ı��������ں���ı���
            int currentLevelSize = que.size();
            while(currentLevelSize > 0){
                currentLevelSize --;

                TreeNode node = que.poll();
            
                levelList.add(node.val);
                if(node.left != null){
                    que.offer(node.left);
                }
                if(node.right != null){
                    que.offer(node.right);
                }
            }
            
            result.add(levelList);
        }
        return result;
    }
}