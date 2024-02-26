package com.cuizx.hot100;

import com.cuizx.binaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmatricTree {

    public boolean isSymmetric(TreeNode root) {
//        return check(root, root);
        return checkByQueue(root, root);
    }

    public boolean check(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null) {
            return false;
        }
        return l.getVal() == r.getVal() && check(l.left, r.right) && check(l.right, r.left);
    }

    public boolean checkByQueue(TreeNode u, TreeNode v) {

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(u);
        queue.offer(v);

        while (!queue.isEmpty()) {
            u = queue.poll();
            v = queue.poll();

            if (u == null && v == null) {
                continue;
            }

            if ((u == null || v == null) || u.getVal() != v.getVal()) {
                return false;
            }

            queue.offer(u.left);
            queue.offer(v.right);

            queue.offer(u.right);
            queue.offer(v.left);
        }
        return true;
    }

}
