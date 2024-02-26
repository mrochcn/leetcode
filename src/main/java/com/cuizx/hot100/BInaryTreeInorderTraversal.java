package com.cuizx.hot100;

import com.cuizx.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BInaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }
    public void dfs(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        dfs(root.left, ans);
        ans.add(root.getVal());
        dfs(root.right, ans);
    }
}
