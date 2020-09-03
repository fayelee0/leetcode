package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

public class RemoveLinkedListElements {
    // Time     O(n)
    // Space    O(1)
    ListNode m0(ListNode head, int val) {
        ListNode sentry = new ListNode(0, head);

        ListNode prev = sentry;
        ListNode node = prev.next;
        while (node != null) {
            if (node.val == val) {
                prev.next = node.next;
            } else {
                prev = node;
            }
            node = prev.next;
        }
        return sentry.next;
    }

    ListNode m1(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        if (head.val == val) {
            return m1(head.next, val);
        }

        head.next = m1(head.next, val);
        return head;
    }
}
