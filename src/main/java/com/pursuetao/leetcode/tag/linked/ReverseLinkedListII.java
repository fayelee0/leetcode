package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

public class ReverseLinkedListII {
    // 1 <= m <= n <= length
    //
    // Time     O(n)
    // Space    O(1)
    ListNode m0(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n) {
            return head;
        } else {
            ListNode ret = new ListNode(0, head);

            // part 0
            ListNode prev = ret;
            int i = 1;
            while (i < m) {
                prev = prev.next;
                i++;
            }

            // part 1 rotate
            ListNode node = prev.next;
            ListNode rest = node.next;

            ListNode last = node;
            ListNode revs = null;

            i = m;
            while (i < n) {
                node.next = revs;
                revs = node;
                node = rest;
                rest = rest.next;
                i++;
            }

            node.next = revs;
            prev.next = node;
            last.next = rest;
            return ret.next;
        }
    }

    // Time     O(n)
    // Space    O(1)
    ListNode m1(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n) {
            return head;
        }

        ListNode ret = new ListNode(0, head);

        ListNode prev = ret;
        for (int i = 1; i < m; i++) {
            prev = prev.next;
        }

        ListNode next = prev.next;
        ListNode node;
        for (int i = m; i < n; i++) {
            node = next.next;
            next.next = node.next;
            node.next = prev.next;
            prev.next = node;
        }
        return ret.next;
    }
}
