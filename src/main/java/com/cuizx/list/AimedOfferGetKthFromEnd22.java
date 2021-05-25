package com.cuizx.list;

public class AimedOfferGetKthFromEnd22 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        dummy.next = head;
        for (int i = 0; i < k; i++) {
            dummy = dummy.next;
        }
        while (dummy != null) {
            dummy = dummy.next;
            ans = ans.next;
        }
        return ans;
    }
}
