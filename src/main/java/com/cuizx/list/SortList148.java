package com.cuizx.list;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortList148 {


    public ListNode sortList(ListNode head) {
        ListNode dummy = head;
        ListNode ans = new ListNode();
        ListNode tmp = ans;
        Queue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        while (dummy != null) {
            queue.add(dummy);
            dummy = dummy.next;
        }
        while (!queue.isEmpty()) {
            tmp.next = queue.poll();
            tmp = tmp.next;
        }
        tmp.next = null;
        return ans.next;
    }
}
