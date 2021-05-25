package com.cuizx.list;

import com.cuizx.list.ListNode;

import java.util.List;

public class AimedOfferDeleteNode18 {
    public static void main(String[] args) {
        ListNode head = new ListNode(-3);
        head.next = new ListNode(5);
        head.next.next = new ListNode(9);
        ListNode head1 = deleteNode(head, 9);
        while (head1 != null) {
            System.out.println(head1.val);
            head1 = head1.next;
        }

    }
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        dummy.next = head;
        while (dummy.next != null) {
            if (dummy.next.val == val) {
                dummy.next = dummy.next.next;
                return ans.next;
            }
            dummy = dummy.next;
        }
        return ans.next;
    }
}
