package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

public class SwapNodesInPairs {
    // 递归
    //
    // Time     O(n)
    // Space    O(n)
    ListNode m0(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode r = m0(head.next.next);
            ListNode s = head.next;

            s.next = head;
            head.next = r;
            return s;
        }
    }

    // 迭代
    //
    // Time     O(n)
    // Space    O(1)
    ListNode m1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode sentry = new ListNode(0);
            ListNode ptr = sentry;
            while (head != null) {
                ListNode f = head;
                ListNode s = head.next;
                if (s != null) {
                    head = s.next;
                    ptr.next = s;
                    ptr = ptr.next;
                    ptr.next = f;
                    ptr = ptr.next;
                    ptr.next = null;
                } else {
                    head = null;
                    ptr.next = f;
                }
            }
            return sentry.next;
        }
    }

    ListNode m2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode sentry = new ListNode(0);
            sentry.next = head;
            ListNode ptr = sentry;
            while (head != null && head.next != null) {
                ListNode cur = head;
                ptr.next = head.next;
                cur.next = head.next.next;

                ptr.next.next = cur;
                ptr = cur;

                head = ptr.next;
            }
            return sentry.next;
        }
    }
}
