package com.cuizx.interview150;

import com.cuizx.binaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InvertTree226 {


    /**
     * 二叉树广度优先遍历
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();

            TreeNode left = tmp.left;
            tmp.left = tmp.right;
            tmp.right = left;
            //如果当前节点的左子树不为空，则放入队列等待后续处理
            if(tmp.left!=null) {
                queue.add(tmp.left);
            }
            //如果当前节点的右子树不为空，则放入队列等待后续处理
            if(tmp.right!=null) {
                queue.add(tmp.right);
            }
        }

        return root;
    }


    public static void main(String[] args) {


    }
}
