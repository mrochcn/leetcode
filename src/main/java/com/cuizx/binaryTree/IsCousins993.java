package com.cuizx.binaryTree;

import java.util.*;

public class IsCousins993 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        isCousins(root, 2, 4);
    }


    /**
     * 标准BFS模版
     * @param root
     * @param x
     * @param y
     * @return
     */
    public static boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<TreeNode>> lists = new LinkedList<>();
        while (!queue.isEmpty()) {
            System.out.println("================");
            List<TreeNode> list = new LinkedList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                System.out.println(node.val);
                list.add(node);
                if (node.left != null) {
                    queue.offer(node.left);
//                    System.out.println(node.left.val);
                }
                if (node.right != null) {
                    queue.offer(node.right);
//                    System.out.println(node.right.val);
                }
            }
            lists.add(list);
        }
//        for (List<TreeNode> list : lists) {
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i).val);
//            }
//        }
//        for (int i = 0; i < 1; i++) {
//            for (int i1 = 0; i1 < lists.get(i).size(); i1++) {
//                System.out.println(lists.get(i).get(i1).val);
//            }
//        }
        return false;
    }
}
