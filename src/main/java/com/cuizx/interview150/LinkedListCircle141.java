package com.cuizx.interview150;

import com.cuizx.list.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCircle141 {


    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head.next != null) {
            set.add(head);
            if (set.add(head)) {
                head = head.next;
            } else {
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {


    }
}
