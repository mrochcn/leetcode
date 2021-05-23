package com.cuizx.list;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Stack;

public class ReverseList206 {


    public static void main(String[] args) throws UnknownHostException {
        ListNode a = new ListNode(1);
        int idx = 1;
        for (int i = 0; i < 5; i++) {
            idx++;
            a.next = new ListNode(idx);
        }
    }
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode dummy = head;
        while (dummy != null) {
            stack.push(dummy);
            dummy = dummy.next;
        }
        ListNode ans = new ListNode();
        ListNode util = ans;
        while (!stack.isEmpty()) {
            util.next = stack.pop();
            util = util.next;
        }
        util.next = null;
        return ans.next;
    }
}
