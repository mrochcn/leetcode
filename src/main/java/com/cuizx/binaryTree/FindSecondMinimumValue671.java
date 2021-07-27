package com.cuizx.binaryTree;

import java.util.*;

public class FindSecondMinimumValue671 {

    public int findSecondMinimumValue(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        dfs(root, list);
        Set<Integer> set = new HashSet<>();
        for (TreeNode treeNode : list) {
            set.add(treeNode.val);
        }
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (Integer integer : set) {
            queue.offer(integer);
        }
        int ans = 0;
        for (int i = 0; i < 2; i++) {
            ans = queue.poll();
        }
        return ans;
    }

    public void dfs(TreeNode root, List list) {
        if (root == null) {
            return;
        }
        dfs(root.left, list);
        dfs(root.right, list);
    }
}
