package com.cuizx.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthLargest215 {
    public static void main(String[] args) {

    }
    public int findKthLargestQueue(int[] nums, int k) {
//        优先队列
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int num : nums) {
            queue.add(num);
        }
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans = queue.poll();
        }
        return ans;
        //堆排序
    }

}
