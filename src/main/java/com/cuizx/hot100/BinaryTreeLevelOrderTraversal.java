package com.cuizx.hot100;

import com.cuizx.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode curNode = q.poll();
                l.add(curNode.getVal());
                if (curNode.left != null) {
                    q.offer(curNode.left);
                }
                if (curNode.right != null) {
                    q.offer(curNode.right);
                }
            }
            ans.add(l);
        }
        return ans;
    }
}
