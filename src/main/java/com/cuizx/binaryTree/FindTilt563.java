package com.cuizx.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class FindTilt563 {

    public int findTilt(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                TreeNode tn = queue.poll();
                if (tn.left != null && tn.right != null) {
                    ans = ans + Math.abs(tn.left.val - tn.right.val);
                } else if (tn.left == null && tn.right == null) {
//                    ans = ans + 0;
                } else {
                    int num = tn.left == null ? tn.right.val : tn.left.val;
                    ans = ans + num;
                }
                if (tn.left != null) {
                    queue.offer(tn.left);
                }
                if (tn.right != null) {
                    queue.offer(tn.right);
                }
            }
        }
        return ans;
    }
}
