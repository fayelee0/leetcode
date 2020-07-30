package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

public class MergeTwoSortedLists {
    // 递归，不影响原链表
    //
    // Time     O(m+n)
    // Space    O(n)
    ListNode m0(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            return new ListNode(l1.val, m0(l1.next, l2));
        } else {
            return new ListNode(l2.val, m0(l1, l2.next));
        }
    }

    // 递归，原地合并
    //
    // Time     O(m+n)
    // Space    O(1)
    ListNode m1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = m0(l1.next, l2);
            return l1;
        }

        l2.next = m0(l1, l2.next);
        return l2;
    }

    // 迭代，原地合并
    //
    // Time     O(m+n)
    // Space    O(1)
    ListNode m2(ListNode l1, ListNode l2) {
        ListNode sentry = new ListNode(0);

        ListNode x = sentry;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                x.next = l1;
                l1 = l1.next;
            } else {
                x.next = l2;
                l2 = l2.next;
            }
            x = x.next;
        }

        if (l1 != null) {
            x.next = l1;
        }

        if (l2 != null) {
            x.next = l2;
        }

        return sentry.next;
    }
}
