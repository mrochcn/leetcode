package com.cuizx.list;

import com.cuizx.list.ListNode;

import java.util.Stack;

public class NC78 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode ans  = ReverseList(head);
        while (ans != null) {
            System.out.println(head.val);
            ans = ans.next;
        }
    }
    public static ListNode ReverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode dummy = head;
        while (dummy != null) {
            stack.push(dummy);
            dummy = dummy.next;
        }
        ListNode ans = new ListNode();
        ListNode res = ans;
        while (!stack.isEmpty()) {
            ans.next = stack.pop();
            ans = ans.next;
        }
        ans.next = null;
        return res.next;
    }
}
