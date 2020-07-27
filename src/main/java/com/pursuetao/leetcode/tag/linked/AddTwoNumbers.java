package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

public class AddTwoNumbers {
    // Time     O(m + n)
    // Space    O(n)
    ListNode m0(ListNode l1, ListNode l2) {
        ListNode sentry = new ListNode(0);

        ListNode node = sentry;
        int c = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                c += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                c += l2.val;
                l2 = l2.next;
            }
            node.next = new ListNode(c % 10);
            node = node.next;
            c /= 10;
        }

        if (c != 0) {
            node.next = new ListNode(c);
        }

        return sentry.next;
    }
}
