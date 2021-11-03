package com.cuizx.topK;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ThirdMax414 {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            //从大到小排序
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int num : nums) {
            priorityQueue.add(num);
        }
        int ans = 0;
        if (priorityQueue.size() < 3) {
            ans = priorityQueue.peek();
        } else {
            for (int i = 0; i < 3; i++) {
                ans = priorityQueue.poll();
            }
        }
        return ans;
    }
}
