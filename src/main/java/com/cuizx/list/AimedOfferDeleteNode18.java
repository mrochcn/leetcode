package com.cuizx.list;

import com.cuizx.list.ListNode;

import java.util.List;

public class AimedOfferDeleteNode18 {
    public static void main(String[] args) {

    }
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        while (dummy.next != null) {
            if (dummy.next.val == val) {
                dummy.next = dummy.next.next;
            }
            dummy = dummy.next;
        }
        return head;
    }
}
