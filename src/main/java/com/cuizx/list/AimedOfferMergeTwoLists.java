package com.cuizx.list;

public class AimedOfferMergeTwoLists {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                dummy.next = l1;
                l1 = l1.next;
                dummy = dummy.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
                dummy = dummy.next;
            }
        }
        dummy.next = l1 == null ? l2 : l1;
        return ans.next;
    }
}
