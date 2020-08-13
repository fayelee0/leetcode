package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

public class RemoveDuplicatesFromSortedListII {
    ListNode m0(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        if (head.val != head.next.val) {
            head.next = m0(head.next);
            return head;
        } else {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return m0(head.next);
        }
    }

    ListNode m1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode sentry = new ListNode(0, head);

        ListNode ptr = sentry;
        ListNode cur = head;
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }

            if (ptr.next == cur) {
                ptr = ptr.next;
            } else {
                ptr.next = cur.next;
            }

            cur = cur.next;
        }
        ptr.next = null;

        return sentry.next;
    }
}
