package com.cuizx.list;

import java.util.Stack;

public class AimedOfferReverseList24 {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        while (!stack.isEmpty()) {
            dummy.next = stack.pop();
            dummy = dummy.next;
        }
        dummy.next = null;
        return ans.next;
    }
}
