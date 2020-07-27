package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

public class RemoveNthNodeFromEndOfList {
    // 通过*快慢指针*将两个指针的间距设置为*n*
    // 然后同步后移快慢指针，知道快指针结束
    //
    // Time     O(n)
    // Space    O(1)
    ListNode m0(ListNode head, int n) {
        if (n == 0) {
            return head;
        }

        ListNode p0 = head;
        ListNode p1 = head;

        while (n >= 0 && p1 != null) {
            p1 = p1.next;
            n--;
        }

        if (n >= 0) {
            return head.next;
        }

        while (p1 != null) {
            p0 = p0.next;
            p1 = p1.next;
        }

        p0.next = p0.next.next;
        return head;
    }

    // Time     O(n)
    // Space    O(1)
    ListNode m1(ListNode head, int n) {
        ListNode sentry = new ListNode(0, head);

        ListNode slow = sentry;
        ListNode fast = sentry;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return sentry.next;
    }
}
