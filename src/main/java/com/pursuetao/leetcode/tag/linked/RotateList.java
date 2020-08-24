package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

public class RotateList {
    ListNode m0(ListNode head, int k) {
        if (head != null && head.next != null) {
            ListNode fast = head;
            ListNode slow = head;

            int size = 1; // if this set 0, after while loop must add 1 (real length)
            while (fast.next != null) { // now fast node is the last node of the first part of the rotate list
                size++;
                fast = fast.next;
            }
//            size++;

            for (int i = size - k % size; i > 1; i--) { // now slow node is the last node of the rest part of the rotate list
                slow = slow.next;
            }

            fast.next = head;
            head = slow.next;
            slow.next = null;
        }
        return head;
    }
}
