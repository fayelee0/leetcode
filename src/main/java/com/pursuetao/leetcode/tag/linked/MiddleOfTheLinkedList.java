package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

public class MiddleOfTheLinkedList {
    ListNode m0(ListNode head) {
        if (head == null || head.next == null ) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.next;
    }
}
