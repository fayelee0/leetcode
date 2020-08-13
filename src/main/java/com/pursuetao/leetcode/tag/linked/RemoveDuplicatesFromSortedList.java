package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

public class RemoveDuplicatesFromSortedList {
    ListNode m0(ListNode head) {
        if (head != null && head.next != null) {
            ListNode ptr = head;
            for (ListNode cur = head.next; cur != null; cur = cur.next) {
                if (ptr.val != cur.val) {
                    ptr.next = cur;
                    ptr = ptr.next;
                }
            }
            ptr.next = null;
        }
        return head;
    }
}
