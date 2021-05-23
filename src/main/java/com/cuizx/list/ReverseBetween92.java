package com.cuizx.list;

import java.util.List;
import java.util.Stack;

public class ReverseBetween92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Stack<Integer> stack = new Stack<>();
        ListNode l = head;
        for (int i = 0; i < left - 1; i++) {
            l = l.next;
        }
        for (int i = 0; i < right - left + 1; i++) {
            stack.push(l.val);
            l = l.next;
        }
        ListNode dummy = head;
        for (int i = 0; i < left - 1; i++) {
            dummy = dummy.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            dummy.val = stack.pop();
            dummy = dummy.next;
        }
        return head;
    }
}
