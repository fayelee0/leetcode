package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

public class PartitionList {
    // Time     O(n)
    // Space    O(1)
    ListNode m0(ListNode head, int x) {
        ListNode rest = new ListNode(0);
        ListNode next = rest;

        ListNode temp = new ListNode(0, head);
        ListNode prev = temp;

        while (head != null) {
            if (head.val < x) {
                prev.next = head;
                prev = prev.next;
            } else {
                next.next = head;
                next = next.next;
            }
            head = head.next;
        }

        prev.next = rest.next;
        next.next = null;

        return temp.next;
    }
}
