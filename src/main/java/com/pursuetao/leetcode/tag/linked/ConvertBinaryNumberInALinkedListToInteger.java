package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger {
    int m0(ListNode head) {
        int ret = 0;
        while (head != null) {
            ret = ret * 2 + head.val;
            head = head.next;
        }
        return ret;
    }
}
